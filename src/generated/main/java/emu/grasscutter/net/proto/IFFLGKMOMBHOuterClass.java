// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IFFLGKMOMBH.proto

package emu.grasscutter.net.proto;

public final class IFFLGKMOMBHOuterClass {
  private IFFLGKMOMBHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code IFFLGKMOMBH}
   */
  public enum IFFLGKMOMBH
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeNone = 0;</code>
     */
    IFFLGKMOMBH_ReportReasonSubtypeNone(0),
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidNickname = 1;</code>
     */
    IFFLGKMOMBH_ReportReasonSubtypeInvalidNickname(1),
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidSignature = 2;</code>
     */
    IFFLGKMOMBH_ReportReasonSubtypeInvalidSignature(2),
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidArrangement = 3;</code>
     */
    IFFLGKMOMBH_ReportReasonSubtypeInvalidArrangement(3),
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidChat = 4;</code>
     */
    IFFLGKMOMBH_ReportReasonSubtypeInvalidChat(4),
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidAvatarName = 5;</code>
     */
    IFFLGKMOMBH_ReportReasonSubtypeInvalidAvatarName(5),
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidOther = 6;</code>
     */
    IFFLGKMOMBH_ReportReasonSubtypeInvalidOther(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeNone = 0;</code>
     */
    public static final int IFFLGKMOMBH_ReportReasonSubtypeNone_VALUE = 0;
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidNickname = 1;</code>
     */
    public static final int IFFLGKMOMBH_ReportReasonSubtypeInvalidNickname_VALUE = 1;
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidSignature = 2;</code>
     */
    public static final int IFFLGKMOMBH_ReportReasonSubtypeInvalidSignature_VALUE = 2;
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidArrangement = 3;</code>
     */
    public static final int IFFLGKMOMBH_ReportReasonSubtypeInvalidArrangement_VALUE = 3;
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidChat = 4;</code>
     */
    public static final int IFFLGKMOMBH_ReportReasonSubtypeInvalidChat_VALUE = 4;
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidAvatarName = 5;</code>
     */
    public static final int IFFLGKMOMBH_ReportReasonSubtypeInvalidAvatarName_VALUE = 5;
    /**
     * <code>IFFLGKMOMBH_ReportReasonSubtypeInvalidOther = 6;</code>
     */
    public static final int IFFLGKMOMBH_ReportReasonSubtypeInvalidOther_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IFFLGKMOMBH valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IFFLGKMOMBH forNumber(int value) {
      switch (value) {
        case 0: return IFFLGKMOMBH_ReportReasonSubtypeNone;
        case 1: return IFFLGKMOMBH_ReportReasonSubtypeInvalidNickname;
        case 2: return IFFLGKMOMBH_ReportReasonSubtypeInvalidSignature;
        case 3: return IFFLGKMOMBH_ReportReasonSubtypeInvalidArrangement;
        case 4: return IFFLGKMOMBH_ReportReasonSubtypeInvalidChat;
        case 5: return IFFLGKMOMBH_ReportReasonSubtypeInvalidAvatarName;
        case 6: return IFFLGKMOMBH_ReportReasonSubtypeInvalidOther;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IFFLGKMOMBH>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IFFLGKMOMBH> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IFFLGKMOMBH>() {
            public IFFLGKMOMBH findValueByNumber(int number) {
              return IFFLGKMOMBH.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IFFLGKMOMBHOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final IFFLGKMOMBH[] VALUES = values();

    public static IFFLGKMOMBH valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private IFFLGKMOMBH(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:IFFLGKMOMBH)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IFFLGKMOMBH.proto*\355\002\n\013IFFLGKMOMBH\022\'\n#I" +
      "FFLGKMOMBH_ReportReasonSubtypeNone\020\000\0222\n." +
      "IFFLGKMOMBH_ReportReasonSubtypeInvalidNi" +
      "ckname\020\001\0223\n/IFFLGKMOMBH_ReportReasonSubt" +
      "ypeInvalidSignature\020\002\0225\n1IFFLGKMOMBH_Rep" +
      "ortReasonSubtypeInvalidArrangement\020\003\022.\n*" +
      "IFFLGKMOMBH_ReportReasonSubtypeInvalidCh" +
      "at\020\004\0224\n0IFFLGKMOMBH_ReportReasonSubtypeI" +
      "nvalidAvatarName\020\005\022/\n+IFFLGKMOMBH_Report" +
      "ReasonSubtypeInvalidOther\020\006B\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}