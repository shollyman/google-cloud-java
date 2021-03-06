// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/scan_config.proto

package com.google.cloud.websecurityscanner.v1beta;

public final class ScanConfigProto {
  private ScanConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_GoogleAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_GoogleAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_CustomAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_CustomAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Schedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Schedule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/websecurityscanner/v1beta"
          + "/scan_config.proto\022&google.cloud.websecu"
          + "rityscanner.v1beta\032\034google/api/annotatio"
          + "ns.proto\0325google/cloud/websecurityscanne"
          + "r/v1beta/scan_run.proto\032\037google/protobuf"
          + "/timestamp.proto\"\227\014\n\nScanConfig\022\014\n\004name\030"
          + "\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\017\n\007max_qps\030\003"
          + " \001(\005\022\025\n\rstarting_urls\030\004 \003(\t\022Y\n\016authentic"
          + "ation\030\005 \001(\0132A.google.cloud.websecuritysc"
          + "anner.v1beta.ScanConfig.Authentication\022P"
          + "\n\nuser_agent\030\006 \001(\0162<.google.cloud.websec"
          + "urityscanner.v1beta.ScanConfig.UserAgent"
          + "\022\032\n\022blacklist_patterns\030\007 \003(\t\022M\n\010schedule"
          + "\030\010 \001(\0132;.google.cloud.websecurityscanner"
          + ".v1beta.ScanConfig.Schedule\022[\n\020target_pl"
          + "atforms\030\t \003(\0162A.google.cloud.websecurity"
          + "scanner.v1beta.ScanConfig.TargetPlatform"
          + "\022{\n!export_to_security_command_center\030\n "
          + "\001(\0162P.google.cloud.websecurityscanner.v1"
          + "beta.ScanConfig.ExportToSecurityCommandC"
          + "enter\022C\n\nlatest_run\030\013 \001(\0132/.google.cloud"
          + ".websecurityscanner.v1beta.ScanRun\022P\n\nri"
          + "sk_level\030\014 \001(\0162<.google.cloud.websecurit"
          + "yscanner.v1beta.ScanConfig.RiskLevel\032\365\002\n"
          + "\016Authentication\022i\n\016google_account\030\001 \001(\0132"
          + "O.google.cloud.websecurityscanner.v1beta"
          + ".ScanConfig.Authentication.GoogleAccount"
          + "H\000\022i\n\016custom_account\030\002 \001(\0132O.google.clou"
          + "d.websecurityscanner.v1beta.ScanConfig.A"
          + "uthentication.CustomAccountH\000\0323\n\rGoogleA"
          + "ccount\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001"
          + "(\t\032F\n\rCustomAccount\022\020\n\010username\030\001 \001(\t\022\020\n"
          + "\010password\030\002 \001(\t\022\021\n\tlogin_url\030\003 \001(\tB\020\n\016au"
          + "thentication\032]\n\010Schedule\0221\n\rschedule_tim"
          + "e\030\001 \001(\0132\032.google.protobuf.Timestamp\022\036\n\026i"
          + "nterval_duration_days\030\002 \001(\005\"`\n\tUserAgent"
          + "\022\032\n\026USER_AGENT_UNSPECIFIED\020\000\022\020\n\014CHROME_L"
          + "INUX\020\001\022\022\n\016CHROME_ANDROID\020\002\022\021\n\rSAFARI_IPH"
          + "ONE\020\003\"N\n\016TargetPlatform\022\037\n\033TARGET_PLATFO"
          + "RM_UNSPECIFIED\020\000\022\016\n\nAPP_ENGINE\020\001\022\013\n\007COMP"
          + "UTE\020\002\"<\n\tRiskLevel\022\032\n\026RISK_LEVEL_UNSPECI"
          + "FIED\020\000\022\n\n\006NORMAL\020\001\022\007\n\003LOW\020\002\"m\n\035ExportToS"
          + "ecurityCommandCenter\0221\n-EXPORT_TO_SECURI"
          + "TY_COMMAND_CENTER_UNSPECIFIED\020\000\022\013\n\007ENABL"
          + "ED\020\001\022\014\n\010DISABLED\020\002B\302\001\n*com.google.cloud."
          + "websecurityscanner.v1betaB\017ScanConfigPro"
          + "toP\001ZXgoogle.golang.org/genproto/googlea"
          + "pis/cloud/websecurityscanner/v1beta;webs"
          + "ecurityscanner\312\002&Google\\Cloud\\WebSecurit"
          + "yScanner\\V1betab\006proto3"
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
          com.google.cloud.websecurityscanner.v1beta.ScanRunProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "MaxQps",
              "StartingUrls",
              "Authentication",
              "UserAgent",
              "BlacklistPatterns",
              "Schedule",
              "TargetPlatforms",
              "ExportToSecurityCommandCenter",
              "LatestRun",
              "RiskLevel",
            });
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_descriptor =
        internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_descriptor,
            new java.lang.String[] {
              "GoogleAccount", "CustomAccount", "Authentication",
            });
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_GoogleAccount_descriptor =
        internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_GoogleAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_GoogleAccount_descriptor,
            new java.lang.String[] {
              "Username", "Password",
            });
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_CustomAccount_descriptor =
        internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_CustomAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Authentication_CustomAccount_descriptor,
            new java.lang.String[] {
              "Username", "Password", "LoginUrl",
            });
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Schedule_descriptor =
        internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Schedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanConfig_Schedule_descriptor,
            new java.lang.String[] {
              "ScheduleTime", "IntervalDurationDays",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1beta.ScanRunProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
