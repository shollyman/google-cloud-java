// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public final class TransferProto {
  private TransferProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/bigquery/datatransfer/v1/"
          + "transfer.proto\022%google.cloud.bigquery.da"
          + "tatransfer.v1\032\034google/api/annotations.pr"
          + "oto\032\034google/protobuf/struct.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\027google/rpc/s"
          + "tatus.proto\"\220\001\n\017ScheduleOptions\022\037\n\027disab"
          + "le_auto_scheduling\030\003 \001(\010\022.\n\nstart_time\030\001"
          + " \001(\0132\032.google.protobuf.Timestamp\022,\n\010end_"
          + "time\030\002 \001(\0132\032.google.protobuf.Timestamp\"\377"
          + "\003\n\016TransferConfig\022\014\n\004name\030\001 \001(\t\022\036\n\026desti"
          + "nation_dataset_id\030\002 \001(\t\022\024\n\014display_name\030"
          + "\003 \001(\t\022\026\n\016data_source_id\030\005 \001(\t\022\'\n\006params\030"
          + "\t \001(\0132\027.google.protobuf.Struct\022\020\n\010schedu"
          + "le\030\007 \001(\t\022P\n\020schedule_options\030\030 \001(\01326.goo"
          + "gle.cloud.bigquery.datatransfer.v1.Sched"
          + "uleOptions\022 \n\030data_refresh_window_days\030\014"
          + " \001(\005\022\020\n\010disabled\030\r \001(\010\022/\n\013update_time\030\004 "
          + "\001(\0132\032.google.protobuf.Timestamp\0221\n\rnext_"
          + "run_time\030\010 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022C\n\005state\030\n \001(\01624.google.cloud.bigquer"
          + "y.datatransfer.v1.TransferState\022\017\n\007user_"
          + "id\030\013 \001(\003\022\026\n\016dataset_region\030\016 \001(\t\"\376\003\n\013Tra"
          + "nsferRun\022\014\n\004name\030\001 \001(\t\0221\n\rschedule_time\030"
          + "\003 \001(\0132\032.google.protobuf.Timestamp\022,\n\010run"
          + "_time\030\n \001(\0132\032.google.protobuf.Timestamp\022"
          + "(\n\014error_status\030\025 \001(\0132\022.google.rpc.Statu"
          + "s\022.\n\nstart_time\030\004 \001(\0132\032.google.protobuf."
          + "Timestamp\022,\n\010end_time\030\005 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022/\n\013update_time\030\006 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\022\'\n\006params\030\t \001(\013"
          + "2\027.google.protobuf.Struct\022\036\n\026destination"
          + "_dataset_id\030\002 \001(\t\022\026\n\016data_source_id\030\007 \001("
          + "\t\022C\n\005state\030\010 \001(\01624.google.cloud.bigquery"
          + ".datatransfer.v1.TransferState\022\017\n\007user_i"
          + "d\030\013 \001(\003\022\020\n\010schedule\030\014 \001(\t\"\212\002\n\017TransferMe"
          + "ssage\0220\n\014message_time\030\001 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022X\n\010severity\030\002 \001(\0162F.goog"
          + "le.cloud.bigquery.datatransfer.v1.Transf"
          + "erMessage.MessageSeverity\022\024\n\014message_tex"
          + "t\030\003 \001(\t\"U\n\017MessageSeverity\022 \n\034MESSAGE_SE"
          + "VERITY_UNSPECIFIED\020\000\022\010\n\004INFO\020\001\022\013\n\007WARNIN"
          + "G\020\002\022\t\n\005ERROR\020\003*K\n\014TransferType\022\035\n\031TRANSF"
          + "ER_TYPE_UNSPECIFIED\020\000\022\t\n\005BATCH\020\001\022\r\n\tSTRE"
          + "AMING\020\002\032\002\030\001*s\n\rTransferState\022\036\n\032TRANSFER"
          + "_STATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\002\022\013\n\007RUN"
          + "NING\020\003\022\r\n\tSUCCEEDED\020\004\022\n\n\006FAILED\020\005\022\r\n\tCAN"
          + "CELLED\020\006B\347\001\n)com.google.cloud.bigquery.d"
          + "atatransfer.v1B\rTransferProtoP\001ZQgoogle."
          + "golang.org/genproto/googleapis/cloud/big"
          + "query/datatransfer/v1;datatransfer\242\002\005GCB"
          + "DT\252\002%Google.Cloud.BigQuery.DataTransfer."
          + "V1\312\002%Google\\Cloud\\BigQuery\\DataTransfer\\"
          + "V1b\006proto3"
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
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor,
            new java.lang.String[] {
              "DisableAutoScheduling", "StartTime", "EndTime",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "DestinationDatasetId",
              "DisplayName",
              "DataSourceId",
              "Params",
              "Schedule",
              "ScheduleOptions",
              "DataRefreshWindowDays",
              "Disabled",
              "UpdateTime",
              "NextRunTime",
              "State",
              "UserId",
              "DatasetRegion",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor,
            new java.lang.String[] {
              "Name",
              "ScheduleTime",
              "RunTime",
              "ErrorStatus",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Params",
              "DestinationDatasetId",
              "DataSourceId",
              "State",
              "UserId",
              "Schedule",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor,
            new java.lang.String[] {
              "MessageTime", "Severity", "MessageText",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
