// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/dialogflow/v2beta1/entity"
          + "_type.proto\022\037google.cloud.dialogflow.v2b"
          + "eta1\032\034google/api/annotations.proto\032#goog"
          + "le/longrunning/operations.proto\032\033google/"
          + "protobuf/empty.proto\032 google/protobuf/fi"
          + "eld_mask.proto\032\027google/api/client.proto\""
          + "\323\003\n\nEntityType\022\014\n\004name\030\001 \001(\t\022\024\n\014display_"
          + "name\030\002 \001(\t\022>\n\004kind\030\003 \001(\01620.google.cloud."
          + "dialogflow.v2beta1.EntityType.Kind\022Z\n\023au"
          + "to_expansion_mode\030\004 \001(\0162=.google.cloud.d"
          + "ialogflow.v2beta1.EntityType.AutoExpansi"
          + "onMode\022D\n\010entities\030\006 \003(\01322.google.cloud."
          + "dialogflow.v2beta1.EntityType.Entity\032)\n\006"
          + "Entity\022\r\n\005value\030\001 \001(\t\022\020\n\010synonyms\030\002 \003(\t\""
          + "9\n\004Kind\022\024\n\020KIND_UNSPECIFIED\020\000\022\014\n\010KIND_MA"
          + "P\020\001\022\r\n\tKIND_LIST\020\002\"Y\n\021AutoExpansionMode\022"
          + "#\n\037AUTO_EXPANSION_MODE_UNSPECIFIED\020\000\022\037\n\033"
          + "AUTO_EXPANSION_MODE_DEFAULT\020\001\"f\n\026ListEnt"
          + "ityTypesRequest\022\016\n\006parent\030\001 \001(\t\022\025\n\rlangu"
          + "age_code\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npag"
          + "e_token\030\004 \001(\t\"u\n\027ListEntityTypesResponse"
          + "\022A\n\014entity_types\030\001 \003(\0132+.google.cloud.di"
          + "alogflow.v2beta1.EntityType\022\027\n\017next_page"
          + "_token\030\002 \001(\t\";\n\024GetEntityTypeRequest\022\014\n\004"
          + "name\030\001 \001(\t\022\025\n\rlanguage_code\030\002 \001(\t\"\202\001\n\027Cr"
          + "eateEntityTypeRequest\022\016\n\006parent\030\001 \001(\t\022@\n"
          + "\013entity_type\030\002 \001(\0132+.google.cloud.dialog"
          + "flow.v2beta1.EntityType\022\025\n\rlanguage_code"
          + "\030\003 \001(\t\"\243\001\n\027UpdateEntityTypeRequest\022@\n\013en"
          + "tity_type\030\001 \001(\0132+.google.cloud.dialogflo"
          + "w.v2beta1.EntityType\022\025\n\rlanguage_code\030\002 "
          + "\001(\t\022/\n\013update_mask\030\003 \001(\0132\032.google.protob"
          + "uf.FieldMask\"\'\n\027DeleteEntityTypeRequest\022"
          + "\014\n\004name\030\001 \001(\t\"\203\002\n\035BatchUpdateEntityTypes"
          + "Request\022\016\n\006parent\030\001 \001(\t\022\037\n\025entity_type_b"
          + "atch_uri\030\002 \001(\tH\000\022T\n\030entity_type_batch_in"
          + "line\030\003 \001(\01320.google.cloud.dialogflow.v2b"
          + "eta1.EntityTypeBatchH\000\022\025\n\rlanguage_code\030"
          + "\004 \001(\t\022/\n\013update_mask\030\005 \001(\0132\032.google.prot"
          + "obuf.FieldMaskB\023\n\021entity_type_batch\"c\n\036B"
          + "atchUpdateEntityTypesResponse\022A\n\014entity_"
          + "types\030\001 \003(\0132+.google.cloud.dialogflow.v2"
          + "beta1.EntityType\"J\n\035BatchDeleteEntityTyp"
          + "esRequest\022\016\n\006parent\030\001 \001(\t\022\031\n\021entity_type"
          + "_names\030\002 \003(\t\"\211\001\n\032BatchCreateEntitiesRequ"
          + "est\022\016\n\006parent\030\001 \001(\t\022D\n\010entities\030\002 \003(\01322."
          + "google.cloud.dialogflow.v2beta1.EntityTy"
          + "pe.Entity\022\025\n\rlanguage_code\030\003 \001(\t\"\272\001\n\032Bat"
          + "chUpdateEntitiesRequest\022\016\n\006parent\030\001 \001(\t\022"
          + "D\n\010entities\030\002 \003(\01322.google.cloud.dialogf"
          + "low.v2beta1.EntityType.Entity\022\025\n\rlanguag"
          + "e_code\030\003 \001(\t\022/\n\013update_mask\030\004 \001(\0132\032.goog"
          + "le.protobuf.FieldMask\"Z\n\032BatchDeleteEnti"
          + "tiesRequest\022\016\n\006parent\030\001 \001(\t\022\025\n\rentity_va"
          + "lues\030\002 \003(\t\022\025\n\rlanguage_code\030\003 \001(\t\"T\n\017Ent"
          + "ityTypeBatch\022A\n\014entity_types\030\001 \003(\0132+.goo"
          + "gle.cloud.dialogflow.v2beta1.EntityType2"
          + "\365\017\n\013EntityTypes\022\274\001\n\017ListEntityTypes\0227.go"
          + "ogle.cloud.dialogflow.v2beta1.ListEntity"
          + "TypesRequest\0328.google.cloud.dialogflow.v"
          + "2beta1.ListEntityTypesResponse\"6\202\323\344\223\0020\022."
          + "/v2beta1/{parent=projects/*/agent}/entit"
          + "yTypes\022\253\001\n\rGetEntityType\0225.google.cloud."
          + "dialogflow.v2beta1.GetEntityTypeRequest\032"
          + "+.google.cloud.dialogflow.v2beta1.Entity"
          + "Type\"6\202\323\344\223\0020\022./v2beta1/{name=projects/*/"
          + "agent/entityTypes/*}\022\276\001\n\020CreateEntityTyp"
          + "e\0228.google.cloud.dialogflow.v2beta1.Crea"
          + "teEntityTypeRequest\032+.google.cloud.dialo"
          + "gflow.v2beta1.EntityType\"C\202\323\344\223\002=\"./v2bet"
          + "a1/{parent=projects/*/agent}/entityTypes"
          + ":\013entity_type\022\312\001\n\020UpdateEntityType\0228.goo"
          + "gle.cloud.dialogflow.v2beta1.UpdateEntit"
          + "yTypeRequest\032+.google.cloud.dialogflow.v"
          + "2beta1.EntityType\"O\202\323\344\223\002I2:/v2beta1/{ent"
          + "ity_type.name=projects/*/agent/entityTyp"
          + "es/*}:\013entity_type\022\234\001\n\020DeleteEntityType\022"
          + "8.google.cloud.dialogflow.v2beta1.Delete"
          + "EntityTypeRequest\032\026.google.protobuf.Empt"
          + "y\"6\202\323\344\223\0020*./v2beta1/{name=projects/*/age"
          + "nt/entityTypes/*}\022\276\001\n\026BatchUpdateEntityT"
          + "ypes\022>.google.cloud.dialogflow.v2beta1.B"
          + "atchUpdateEntityTypesRequest\032\035.google.lo"
          + "ngrunning.Operation\"E\202\323\344\223\002?\":/v2beta1/{p"
          + "arent=projects/*/agent}/entityTypes:batc"
          + "hUpdate:\001*\022\276\001\n\026BatchDeleteEntityTypes\022>."
          + "google.cloud.dialogflow.v2beta1.BatchDel"
          + "eteEntityTypesRequest\032\035.google.longrunni"
          + "ng.Operation\"E\202\323\344\223\002?\":/v2beta1/{parent=p"
          + "rojects/*/agent}/entityTypes:batchDelete"
          + ":\001*\022\303\001\n\023BatchCreateEntities\022;.google.clo"
          + "ud.dialogflow.v2beta1.BatchCreateEntitie"
          + "sRequest\032\035.google.longrunning.Operation\""
          + "P\202\323\344\223\002J\"E/v2beta1/{parent=projects/*/age"
          + "nt/entityTypes/*}/entities:batchCreate:\001"
          + "*\022\303\001\n\023BatchUpdateEntities\022;.google.cloud"
          + ".dialogflow.v2beta1.BatchUpdateEntitiesR"
          + "equest\032\035.google.longrunning.Operation\"P\202"
          + "\323\344\223\002J\"E/v2beta1/{parent=projects/*/agent"
          + "/entityTypes/*}/entities:batchUpdate:\001*\022"
          + "\303\001\n\023BatchDeleteEntities\022;.google.cloud.d"
          + "ialogflow.v2beta1.BatchDeleteEntitiesReq"
          + "uest\032\035.google.longrunning.Operation\"P\202\323\344"
          + "\223\002J\"E/v2beta1/{parent=projects/*/agent/e"
          + "ntityTypes/*}/entities:batchDelete:\001*\032x\312"
          + "A\031dialogflow.googleapis.com\322AYhttps://ww"
          + "w.googleapis.com/auth/cloud-platform,htt"
          + "ps://www.googleapis.com/auth/dialogflowB"
          + "\255\001\n#com.google.cloud.dialogflow.v2beta1B"
          + "\017EntityTypeProtoP\001ZIgoogle.golang.org/ge"
          + "nproto/googleapis/cloud/dialogflow/v2bet"
          + "a1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dia"
          + "logflow.V2beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Kind", "AutoExpansionMode", "Entities",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor,
            new java.lang.String[] {
              "Value", "Synonyms",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityType", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "EntityTypeBatchUri",
              "EntityTypeBatchInline",
              "LanguageCode",
              "UpdateMask",
              "EntityTypeBatch",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityTypeNames",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityValues", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
