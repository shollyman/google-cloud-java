package com.google.cloud.bigquery;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

import com.google.api.services.bigquery.model.Model;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import jdk.internal.joptsimple.internal.Strings;

import static com.google.common.base.Preconditions.checkNotNull;


public class ModelInfo implements Serializable {

    static final Function<Model, ModelInfo> FROM_PB_FUNCTION =
            new Function<Model, ModelInfo>() {
                @Override
                public ModelInfo apply(Model pb) {
                    return ModelInfo.fromPb(pb);
                }
            };
    static final Function<ModelInfo, Model> TO_PB_FUNCTION =
            new Function<ModelInfo, Model>() {
                @Override
                public Model apply(ModelInfo ModelInfo) {
                    return ModelInfo.toPb();
                }
            };

    private final String etag;
    private final ModelId modelId;
    private final String description;
    private final String modelType;
    private final String friendlyName;
    private final Long creationTime;
    private final Long lastModifiedTime;
    private final Long expirationTime;
    private final Labels labels;


    public abstract static class Builder {

        public abstract Builder setDescription(String description);

        public abstract Builder setFriendlyName(String friendlyName);

        public abstract Builder setExpirationTime(Long expirationTime);

        public abstract Builder setLabels(Map<String, String> labels);

        public abstract Builder setModelId(ModelId modelId);

        abstract Builder setEtag(String etag);
        abstract Builder setModelType(String modelType);
        abstract Builder setCreationTime(Long creation);
        abstract Builder setLastModifiedTime(Long lastModifiedTime);


        public abstract ModelInfo build();
    }

    static class BuilderImpl extends Builder {
        private String etag;
        private ModelId modelId;
        private String description;
        private String modelType;
        private String friendlyName;
        private Long creationTime;
        private Long lastModifiedTime;
        private Long expirationTime;
        private Labels labels = Labels.ZERO;

        BuilderImpl() {}

        BuilderImpl(ModelInfo modelInfo) {
            this.etag = modelInfo.etag;
            this.modelId = modelInfo.modelId;
            this.description = modelInfo.description;
            this.friendlyName = modelInfo.friendlyName;
            this.modelType = modelInfo.modelType;
            this.creationTime = modelInfo.creationTime;
            this.lastModifiedTime = modelInfo.lastModifiedTime;
            this.expirationTime = modelInfo.expirationTime;
        }

        BuilderImpl(Model modelPb) {
            this.modelId = ModelId.fromPb((modelPb.getModelReference());
            if (modelPb.getLastModifiedTime() != null) {
                this.setLastModifiedTime(modelPb.getLastModifiedTime().longValue());
            }
            this.etag = modelPb.getEtag();
            this.description = modelPb.getDescription();
            this.friendlyName = modelPb.getFriendlyName();
            this.modelType = modelPb.getModelType();
            this.creationTime = modelPb.getCreationTime();
            this.lastModifiedTime = modelPb.getLastModifiedTime();
            this.expirationTime = modelPb.getExpirationTime();
            this.labels = Labels.fromPb(modelPb.getLabels());
        }

        @Override
        Builder setEtag(String etag) {
            this.etag = etag;
            return this;
        }

        @Override
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        @Override
        public Builder setFriendlyName(String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        @Override
        Builder setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        @Override
        Builder setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        @Override
        Builder setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        @Override
        public Builder setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        @Override
        public Builder setModelId(ModelId modelId) {
            this.modelId = modelId;
            return this;
        }

        @Override
        public Builder setLabels(Map<String, String> labels) {
            this.labels = Labels.fromUser(labels);
            return this;
        }

        @Override
        public ModelInfo build() { return new ModelInfo(this); }
    }

    ModelInfo(BuilderImpl builder) {
        this.modelId = checkNotNull(builder.modelId);
        this.etag = builder.etag;
        this.description = builder.description;
        this.friendlyName = builder.friendlyName;
        this.creationTime = builder.creationTime;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.expirationTime = builder.expirationTime;
        this.labels = builder.labels;
    }

    public String getEtag() { return etag; }

    public ModelId getModelId() { return modelId; }

    public String getDescription() { return description; }

    public String getFriendlyName() { return friendlyName; }

    public Long getCreationTime() { return creationTime; }

    public Long getLastModifiedTime() { return lastModifiedTime; }

    public Long getExpirationTime() { return expirationTime; }

    public Map<String, String> getLabels() { return labels.userMap(); }

    public Builder toBuilder() { return new BuilderImpl(this); }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("modelId", modelId)
                .add("etag", etag)
                .add("description", description)
                .add("friendlyName", friendlyName)
                .add("creationTime", creationTime)
                .add("lastModifiedTime", lastModifiedTime)
                .add("expirationTime", expirationTime)
                .add("labels", labels)
                .toString();
    }

    @Override
    public int hashcode() { return Objects.hash(modelId); }

    @Override
    public boolean equals(Object obj) {
        return obj == this
                || obj != null
                && obj.getClass().equals(ModelInfo.class)
                && Objects.equals(toPb(), ((ModelInfo) obj).toPb());
    }

    public static Builder newBuilder(ModelId modelId) {
        return new BuilderImpl().setModelId(modelId);
    }

    public static ModelInfo of(ModelId modelId) {
        return newBuilder(modelId).build();
    }

    ModelInfo setProjectId(String projectId) {
        if (Strings.isNullOrEmpty(getModelId().getProject())) {
            return toBuilder().setModelId(getModelId().setProjectId(projectId)).build();
        }
        return this;
    }

    Model toPb() {
        Model modelPb =
    }

    static ModelInfo fromPb(Model modelPb) { return new BuilderImpl(modelPb).build(); }

}
