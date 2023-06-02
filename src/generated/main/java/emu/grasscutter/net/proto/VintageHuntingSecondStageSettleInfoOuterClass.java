// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageHuntingSecondStageSettleInfo.proto

package emu.grasscutter.net.proto;

public final class VintageHuntingSecondStageSettleInfoOuterClass {
  private VintageHuntingSecondStageSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageHuntingSecondStageSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageHuntingSecondStageSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 capture_animal_num = 4;</code>
     * @return The captureAnimalNum.
     */
    int getCaptureAnimalNum();

    /**
     * <code>uint32 total_num = 7;</code>
     * @return The totalNum.
     */
    int getTotalNum();

    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */
    int getAnimalCountMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */
    boolean containsAnimalCountMap(
        int key);
    /**
     * Use {@link #getAnimalCountMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAnimalCountMap();
    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAnimalCountMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */

    int getAnimalCountMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */

    int getAnimalCountMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * Obf: OGILNLELDED
   * </pre>
   *
   * Protobuf type {@code VintageHuntingSecondStageSettleInfo}
   */
  public static final class VintageHuntingSecondStageSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageHuntingSecondStageSettleInfo)
      VintageHuntingSecondStageSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageHuntingSecondStageSettleInfo.newBuilder() to construct.
    private VintageHuntingSecondStageSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageHuntingSecondStageSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageHuntingSecondStageSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageHuntingSecondStageSettleInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {

              captureAnimalNum_ = input.readUInt32();
              break;
            }
            case 56: {

              totalNum_ = input.readUInt32();
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                animalCountMap_ = com.google.protobuf.MapField.newMapField(
                    AnimalCountMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              animalCountMap__ = input.readMessage(
                  AnimalCountMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              animalCountMap_.getMutableMap().put(
                  animalCountMap__.getKey(), animalCountMap__.getValue());
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.internal_static_VintageHuntingSecondStageSettleInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 12:
          return internalGetAnimalCountMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.internal_static_VintageHuntingSecondStageSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo.class, emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo.Builder.class);
    }

    public static final int CAPTURE_ANIMAL_NUM_FIELD_NUMBER = 4;
    private int captureAnimalNum_;
    /**
     * <code>uint32 capture_animal_num = 4;</code>
     * @return The captureAnimalNum.
     */
    @java.lang.Override
    public int getCaptureAnimalNum() {
      return captureAnimalNum_;
    }

    public static final int TOTAL_NUM_FIELD_NUMBER = 7;
    private int totalNum_;
    /**
     * <code>uint32 total_num = 7;</code>
     * @return The totalNum.
     */
    @java.lang.Override
    public int getTotalNum() {
      return totalNum_;
    }

    public static final int ANIMAL_COUNT_MAP_FIELD_NUMBER = 12;
    private static final class AnimalCountMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.internal_static_VintageHuntingSecondStageSettleInfo_AnimalCountMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> animalCountMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetAnimalCountMap() {
      if (animalCountMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AnimalCountMapDefaultEntryHolder.defaultEntry);
      }
      return animalCountMap_;
    }

    public int getAnimalCountMapCount() {
      return internalGetAnimalCountMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */

    @java.lang.Override
    public boolean containsAnimalCountMap(
        int key) {
      
      return internalGetAnimalCountMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAnimalCountMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAnimalCountMap() {
      return getAnimalCountMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getAnimalCountMapMap() {
      return internalGetAnimalCountMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */
    @java.lang.Override

    public int getAnimalCountMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAnimalCountMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
     */
    @java.lang.Override

    public int getAnimalCountMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAnimalCountMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (captureAnimalNum_ != 0) {
        output.writeUInt32(4, captureAnimalNum_);
      }
      if (totalNum_ != 0) {
        output.writeUInt32(7, totalNum_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetAnimalCountMap(),
          AnimalCountMapDefaultEntryHolder.defaultEntry,
          12);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (captureAnimalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, captureAnimalNum_);
      }
      if (totalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, totalNum_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetAnimalCountMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        animalCountMap__ = AnimalCountMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, animalCountMap__);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo other = (emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo) obj;

      if (getCaptureAnimalNum()
          != other.getCaptureAnimalNum()) return false;
      if (getTotalNum()
          != other.getTotalNum()) return false;
      if (!internalGetAnimalCountMap().equals(
          other.internalGetAnimalCountMap())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CAPTURE_ANIMAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureAnimalNum();
      hash = (37 * hash) + TOTAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTotalNum();
      if (!internalGetAnimalCountMap().getMap().isEmpty()) {
        hash = (37 * hash) + ANIMAL_COUNT_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAnimalCountMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: OGILNLELDED
     * </pre>
     *
     * Protobuf type {@code VintageHuntingSecondStageSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageHuntingSecondStageSettleInfo)
        emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.internal_static_VintageHuntingSecondStageSettleInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetAnimalCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutableAnimalCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.internal_static_VintageHuntingSecondStageSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo.class, emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        captureAnimalNum_ = 0;

        totalNum_ = 0;

        internalGetMutableAnimalCountMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.internal_static_VintageHuntingSecondStageSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo build() {
        emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo buildPartial() {
        emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo result = new emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo(this);
        int from_bitField0_ = bitField0_;
        result.captureAnimalNum_ = captureAnimalNum_;
        result.totalNum_ = totalNum_;
        result.animalCountMap_ = internalGetAnimalCountMap();
        result.animalCountMap_.makeImmutable();
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo other) {
        if (other == emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo.getDefaultInstance()) return this;
        if (other.getCaptureAnimalNum() != 0) {
          setCaptureAnimalNum(other.getCaptureAnimalNum());
        }
        if (other.getTotalNum() != 0) {
          setTotalNum(other.getTotalNum());
        }
        internalGetMutableAnimalCountMap().mergeFrom(
            other.internalGetAnimalCountMap());
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int captureAnimalNum_ ;
      /**
       * <code>uint32 capture_animal_num = 4;</code>
       * @return The captureAnimalNum.
       */
      @java.lang.Override
      public int getCaptureAnimalNum() {
        return captureAnimalNum_;
      }
      /**
       * <code>uint32 capture_animal_num = 4;</code>
       * @param value The captureAnimalNum to set.
       * @return This builder for chaining.
       */
      public Builder setCaptureAnimalNum(int value) {
        
        captureAnimalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 capture_animal_num = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaptureAnimalNum() {
        
        captureAnimalNum_ = 0;
        onChanged();
        return this;
      }

      private int totalNum_ ;
      /**
       * <code>uint32 total_num = 7;</code>
       * @return The totalNum.
       */
      @java.lang.Override
      public int getTotalNum() {
        return totalNum_;
      }
      /**
       * <code>uint32 total_num = 7;</code>
       * @param value The totalNum to set.
       * @return This builder for chaining.
       */
      public Builder setTotalNum(int value) {
        
        totalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_num = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalNum() {
        
        totalNum_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> animalCountMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetAnimalCountMap() {
        if (animalCountMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AnimalCountMapDefaultEntryHolder.defaultEntry);
        }
        return animalCountMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableAnimalCountMap() {
        onChanged();;
        if (animalCountMap_ == null) {
          animalCountMap_ = com.google.protobuf.MapField.newMapField(
              AnimalCountMapDefaultEntryHolder.defaultEntry);
        }
        if (!animalCountMap_.isMutable()) {
          animalCountMap_ = animalCountMap_.copy();
        }
        return animalCountMap_;
      }

      public int getAnimalCountMapCount() {
        return internalGetAnimalCountMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
       */

      @java.lang.Override
      public boolean containsAnimalCountMap(
          int key) {
        
        return internalGetAnimalCountMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAnimalCountMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getAnimalCountMap() {
        return getAnimalCountMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getAnimalCountMapMap() {
        return internalGetAnimalCountMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
       */
      @java.lang.Override

      public int getAnimalCountMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAnimalCountMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
       */
      @java.lang.Override

      public int getAnimalCountMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAnimalCountMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAnimalCountMap() {
        internalGetMutableAnimalCountMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
       */

      public Builder removeAnimalCountMap(
          int key) {
        
        internalGetMutableAnimalCountMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableAnimalCountMap() {
        return internalGetMutableAnimalCountMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
       */
      public Builder putAnimalCountMap(
          int key,
          int value) {
        
        
        internalGetMutableAnimalCountMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; animal_count_map = 12;</code>
       */

      public Builder putAllAnimalCountMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableAnimalCountMap().getMutableMap()
            .putAll(values);
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:VintageHuntingSecondStageSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageHuntingSecondStageSettleInfo)
    private static final emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo();
    }

    public static emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageHuntingSecondStageSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageHuntingSecondStageSettleInfo>() {
      @java.lang.Override
      public VintageHuntingSecondStageSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageHuntingSecondStageSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageHuntingSecondStageSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageHuntingSecondStageSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageHuntingSecondStageSettleInfoOuterClass.VintageHuntingSecondStageSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageHuntingSecondStageSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageHuntingSecondStageSettleInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageHuntingSecondStageSettleInfo_AnimalCountMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageHuntingSecondStageSettleInfo_AnimalCountMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)VintageHuntingSecondStageSettleInfo.pr" +
      "oto\"\337\001\n#VintageHuntingSecondStageSettleI" +
      "nfo\022\032\n\022capture_animal_num\030\004 \001(\r\022\021\n\ttotal" +
      "_num\030\007 \001(\r\022R\n\020animal_count_map\030\014 \003(\01328.V" +
      "intageHuntingSecondStageSettleInfo.Anima" +
      "lCountMapEntry\0325\n\023AnimalCountMapEntry\022\013\n" +
      "\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageHuntingSecondStageSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageHuntingSecondStageSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageHuntingSecondStageSettleInfo_descriptor,
        new java.lang.String[] { "CaptureAnimalNum", "TotalNum", "AnimalCountMap", });
    internal_static_VintageHuntingSecondStageSettleInfo_AnimalCountMapEntry_descriptor =
      internal_static_VintageHuntingSecondStageSettleInfo_descriptor.getNestedTypes().get(0);
    internal_static_VintageHuntingSecondStageSettleInfo_AnimalCountMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageHuntingSecondStageSettleInfo_AnimalCountMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}