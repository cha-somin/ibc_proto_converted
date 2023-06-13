// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/epoch_tracker.proto

package com.stride.stakeibc;

public final class EpochTrackerProto {
  private EpochTrackerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EpochTrackerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:stride.stakeibc.EpochTracker)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
     * @return The epochIdentifier.
     */
    java.lang.String getEpochIdentifier();
    /**
     * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
     * @return The bytes for epochIdentifier.
     */
    com.google.protobuf.ByteString
        getEpochIdentifierBytes();

    /**
     * <code>uint64 epoch_number = 2 [json_name = "epochNumber"];</code>
     * @return The epochNumber.
     */
    long getEpochNumber();

    /**
     * <code>uint64 next_epoch_start_time = 3 [json_name = "nextEpochStartTime"];</code>
     * @return The nextEpochStartTime.
     */
    long getNextEpochStartTime();

    /**
     * <code>uint64 duration = 4 [json_name = "duration"];</code>
     * @return The duration.
     */
    long getDuration();
  }
  /**
   * Protobuf type {@code stride.stakeibc.EpochTracker}
   */
  public static final class EpochTracker extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:stride.stakeibc.EpochTracker)
      EpochTrackerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EpochTracker.newBuilder() to construct.
    private EpochTracker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EpochTracker() {
      epochIdentifier_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EpochTracker();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.stakeibc.EpochTrackerProto.internal_static_stride_stakeibc_EpochTracker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.stakeibc.EpochTrackerProto.internal_static_stride_stakeibc_EpochTracker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.stakeibc.EpochTrackerProto.EpochTracker.class, com.stride.stakeibc.EpochTrackerProto.EpochTracker.Builder.class);
    }

    public static final int EPOCH_IDENTIFIER_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object epochIdentifier_ = "";
    /**
     * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
     * @return The epochIdentifier.
     */
    @java.lang.Override
    public java.lang.String getEpochIdentifier() {
      java.lang.Object ref = epochIdentifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        epochIdentifier_ = s;
        return s;
      }
    }
    /**
     * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
     * @return The bytes for epochIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEpochIdentifierBytes() {
      java.lang.Object ref = epochIdentifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        epochIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EPOCH_NUMBER_FIELD_NUMBER = 2;
    private long epochNumber_ = 0L;
    /**
     * <code>uint64 epoch_number = 2 [json_name = "epochNumber"];</code>
     * @return The epochNumber.
     */
    @java.lang.Override
    public long getEpochNumber() {
      return epochNumber_;
    }

    public static final int NEXT_EPOCH_START_TIME_FIELD_NUMBER = 3;
    private long nextEpochStartTime_ = 0L;
    /**
     * <code>uint64 next_epoch_start_time = 3 [json_name = "nextEpochStartTime"];</code>
     * @return The nextEpochStartTime.
     */
    @java.lang.Override
    public long getNextEpochStartTime() {
      return nextEpochStartTime_;
    }

    public static final int DURATION_FIELD_NUMBER = 4;
    private long duration_ = 0L;
    /**
     * <code>uint64 duration = 4 [json_name = "duration"];</code>
     * @return The duration.
     */
    @java.lang.Override
    public long getDuration() {
      return duration_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(epochIdentifier_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, epochIdentifier_);
      }
      if (epochNumber_ != 0L) {
        output.writeUInt64(2, epochNumber_);
      }
      if (nextEpochStartTime_ != 0L) {
        output.writeUInt64(3, nextEpochStartTime_);
      }
      if (duration_ != 0L) {
        output.writeUInt64(4, duration_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(epochIdentifier_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, epochIdentifier_);
      }
      if (epochNumber_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, epochNumber_);
      }
      if (nextEpochStartTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, nextEpochStartTime_);
      }
      if (duration_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, duration_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.stride.stakeibc.EpochTrackerProto.EpochTracker)) {
        return super.equals(obj);
      }
      com.stride.stakeibc.EpochTrackerProto.EpochTracker other = (com.stride.stakeibc.EpochTrackerProto.EpochTracker) obj;

      if (!getEpochIdentifier()
          .equals(other.getEpochIdentifier())) return false;
      if (getEpochNumber()
          != other.getEpochNumber()) return false;
      if (getNextEpochStartTime()
          != other.getNextEpochStartTime()) return false;
      if (getDuration()
          != other.getDuration()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EPOCH_IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getEpochIdentifier().hashCode();
      hash = (37 * hash) + EPOCH_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEpochNumber());
      hash = (37 * hash) + NEXT_EPOCH_START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNextEpochStartTime());
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDuration());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker parseFrom(
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
    public static Builder newBuilder(com.stride.stakeibc.EpochTrackerProto.EpochTracker prototype) {
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
     * Protobuf type {@code stride.stakeibc.EpochTracker}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:stride.stakeibc.EpochTracker)
        com.stride.stakeibc.EpochTrackerProto.EpochTrackerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.stride.stakeibc.EpochTrackerProto.internal_static_stride_stakeibc_EpochTracker_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.stride.stakeibc.EpochTrackerProto.internal_static_stride_stakeibc_EpochTracker_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.stride.stakeibc.EpochTrackerProto.EpochTracker.class, com.stride.stakeibc.EpochTrackerProto.EpochTracker.Builder.class);
      }

      // Construct using com.stride.stakeibc.EpochTrackerProto.EpochTracker.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        epochIdentifier_ = "";
        epochNumber_ = 0L;
        nextEpochStartTime_ = 0L;
        duration_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.stride.stakeibc.EpochTrackerProto.internal_static_stride_stakeibc_EpochTracker_descriptor;
      }

      @java.lang.Override
      public com.stride.stakeibc.EpochTrackerProto.EpochTracker getDefaultInstanceForType() {
        return com.stride.stakeibc.EpochTrackerProto.EpochTracker.getDefaultInstance();
      }

      @java.lang.Override
      public com.stride.stakeibc.EpochTrackerProto.EpochTracker build() {
        com.stride.stakeibc.EpochTrackerProto.EpochTracker result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.stride.stakeibc.EpochTrackerProto.EpochTracker buildPartial() {
        com.stride.stakeibc.EpochTrackerProto.EpochTracker result = new com.stride.stakeibc.EpochTrackerProto.EpochTracker(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.stride.stakeibc.EpochTrackerProto.EpochTracker result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.epochIdentifier_ = epochIdentifier_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.epochNumber_ = epochNumber_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.nextEpochStartTime_ = nextEpochStartTime_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.duration_ = duration_;
        }
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
        if (other instanceof com.stride.stakeibc.EpochTrackerProto.EpochTracker) {
          return mergeFrom((com.stride.stakeibc.EpochTrackerProto.EpochTracker)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.stride.stakeibc.EpochTrackerProto.EpochTracker other) {
        if (other == com.stride.stakeibc.EpochTrackerProto.EpochTracker.getDefaultInstance()) return this;
        if (!other.getEpochIdentifier().isEmpty()) {
          epochIdentifier_ = other.epochIdentifier_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getEpochNumber() != 0L) {
          setEpochNumber(other.getEpochNumber());
        }
        if (other.getNextEpochStartTime() != 0L) {
          setNextEpochStartTime(other.getNextEpochStartTime());
        }
        if (other.getDuration() != 0L) {
          setDuration(other.getDuration());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                epochIdentifier_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                epochNumber_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                nextEpochStartTime_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                duration_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object epochIdentifier_ = "";
      /**
       * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
       * @return The epochIdentifier.
       */
      public java.lang.String getEpochIdentifier() {
        java.lang.Object ref = epochIdentifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          epochIdentifier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
       * @return The bytes for epochIdentifier.
       */
      public com.google.protobuf.ByteString
          getEpochIdentifierBytes() {
        java.lang.Object ref = epochIdentifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          epochIdentifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
       * @param value The epochIdentifier to set.
       * @return This builder for chaining.
       */
      public Builder setEpochIdentifier(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        epochIdentifier_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
       * @return This builder for chaining.
       */
      public Builder clearEpochIdentifier() {
        epochIdentifier_ = getDefaultInstance().getEpochIdentifier();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string epoch_identifier = 1 [json_name = "epochIdentifier"];</code>
       * @param value The bytes for epochIdentifier to set.
       * @return This builder for chaining.
       */
      public Builder setEpochIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        epochIdentifier_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private long epochNumber_ ;
      /**
       * <code>uint64 epoch_number = 2 [json_name = "epochNumber"];</code>
       * @return The epochNumber.
       */
      @java.lang.Override
      public long getEpochNumber() {
        return epochNumber_;
      }
      /**
       * <code>uint64 epoch_number = 2 [json_name = "epochNumber"];</code>
       * @param value The epochNumber to set.
       * @return This builder for chaining.
       */
      public Builder setEpochNumber(long value) {

        epochNumber_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 epoch_number = 2 [json_name = "epochNumber"];</code>
       * @return This builder for chaining.
       */
      public Builder clearEpochNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        epochNumber_ = 0L;
        onChanged();
        return this;
      }

      private long nextEpochStartTime_ ;
      /**
       * <code>uint64 next_epoch_start_time = 3 [json_name = "nextEpochStartTime"];</code>
       * @return The nextEpochStartTime.
       */
      @java.lang.Override
      public long getNextEpochStartTime() {
        return nextEpochStartTime_;
      }
      /**
       * <code>uint64 next_epoch_start_time = 3 [json_name = "nextEpochStartTime"];</code>
       * @param value The nextEpochStartTime to set.
       * @return This builder for chaining.
       */
      public Builder setNextEpochStartTime(long value) {

        nextEpochStartTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 next_epoch_start_time = 3 [json_name = "nextEpochStartTime"];</code>
       * @return This builder for chaining.
       */
      public Builder clearNextEpochStartTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        nextEpochStartTime_ = 0L;
        onChanged();
        return this;
      }

      private long duration_ ;
      /**
       * <code>uint64 duration = 4 [json_name = "duration"];</code>
       * @return The duration.
       */
      @java.lang.Override
      public long getDuration() {
        return duration_;
      }
      /**
       * <code>uint64 duration = 4 [json_name = "duration"];</code>
       * @param value The duration to set.
       * @return This builder for chaining.
       */
      public Builder setDuration(long value) {

        duration_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 duration = 4 [json_name = "duration"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDuration() {
        bitField0_ = (bitField0_ & ~0x00000008);
        duration_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:stride.stakeibc.EpochTracker)
    }

    // @@protoc_insertion_point(class_scope:stride.stakeibc.EpochTracker)
    private static final com.stride.stakeibc.EpochTrackerProto.EpochTracker DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.stride.stakeibc.EpochTrackerProto.EpochTracker();
    }

    public static com.stride.stakeibc.EpochTrackerProto.EpochTracker getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EpochTracker>
        PARSER = new com.google.protobuf.AbstractParser<EpochTracker>() {
      @java.lang.Override
      public EpochTracker parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<EpochTracker> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EpochTracker> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.stride.stakeibc.EpochTrackerProto.EpochTracker getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_stakeibc_EpochTracker_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_stakeibc_EpochTracker_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#stride/stakeibc/epoch_tracker.proto\022\017s" +
      "tride.stakeibc\"\253\001\n\014EpochTracker\022)\n\020epoch" +
      "_identifier\030\001 \001(\tR\017epochIdentifier\022!\n\014ep" +
      "och_number\030\002 \001(\004R\013epochNumber\0221\n\025next_ep" +
      "och_start_time\030\003 \001(\004R\022nextEpochStartTime" +
      "\022\032\n\010duration\030\004 \001(\004R\010durationB\266\001\n\023com.str" +
      "ide.stakeibcB\021EpochTrackerProtoZ1github." +
      "com/Stride-Labs/stride/v9/x/stakeibc/typ" +
      "es\242\002\003SSX\252\002\017Stride.Stakeibc\312\002\017Stride\\Stak" +
      "eibc\342\002\033Stride\\Stakeibc\\GPBMetadata\352\002\020Str" +
      "ide::Stakeibcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_stride_stakeibc_EpochTracker_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_stakeibc_EpochTracker_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_stakeibc_EpochTracker_descriptor,
        new java.lang.String[] { "EpochIdentifier", "EpochNumber", "NextEpochStartTime", "Duration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
