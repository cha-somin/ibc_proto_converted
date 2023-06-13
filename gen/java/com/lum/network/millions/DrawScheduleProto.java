// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/draw_schedule.proto

package com.lum.network.millions;

public final class DrawScheduleProto {
  private DrawScheduleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DrawScheduleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:lum.network.millions.DrawSchedule)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the initialDrawAt field is set.
     */
    boolean hasInitialDrawAt();
    /**
     * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The initialDrawAt.
     */
    com.google.protobuf.Timestamp getInitialDrawAt();
    /**
     * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    com.google.protobuf.TimestampOrBuilder getInitialDrawAtOrBuilder();

    /**
     * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the drawDelta field is set.
     */
    boolean hasDrawDelta();
    /**
     * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The drawDelta.
     */
    com.google.protobuf.Duration getDrawDelta();
    /**
     * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    com.google.protobuf.DurationOrBuilder getDrawDeltaOrBuilder();
  }
  /**
   * Protobuf type {@code lum.network.millions.DrawSchedule}
   */
  public static final class DrawSchedule extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:lum.network.millions.DrawSchedule)
      DrawScheduleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DrawSchedule.newBuilder() to construct.
    private DrawSchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DrawSchedule() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DrawSchedule();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.millions.DrawScheduleProto.internal_static_lum_network_millions_DrawSchedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.millions.DrawScheduleProto.internal_static_lum_network_millions_DrawSchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.millions.DrawScheduleProto.DrawSchedule.class, com.lum.network.millions.DrawScheduleProto.DrawSchedule.Builder.class);
    }

    public static final int INITIAL_DRAW_AT_FIELD_NUMBER = 1;
    private com.google.protobuf.Timestamp initialDrawAt_;
    /**
     * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the initialDrawAt field is set.
     */
    @java.lang.Override
    public boolean hasInitialDrawAt() {
      return initialDrawAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The initialDrawAt.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getInitialDrawAt() {
      return initialDrawAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : initialDrawAt_;
    }
    /**
     * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getInitialDrawAtOrBuilder() {
      return initialDrawAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : initialDrawAt_;
    }

    public static final int DRAW_DELTA_FIELD_NUMBER = 2;
    private com.google.protobuf.Duration drawDelta_;
    /**
     * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the drawDelta field is set.
     */
    @java.lang.Override
    public boolean hasDrawDelta() {
      return drawDelta_ != null;
    }
    /**
     * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The drawDelta.
     */
    @java.lang.Override
    public com.google.protobuf.Duration getDrawDelta() {
      return drawDelta_ == null ? com.google.protobuf.Duration.getDefaultInstance() : drawDelta_;
    }
    /**
     * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    @java.lang.Override
    public com.google.protobuf.DurationOrBuilder getDrawDeltaOrBuilder() {
      return drawDelta_ == null ? com.google.protobuf.Duration.getDefaultInstance() : drawDelta_;
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
      if (initialDrawAt_ != null) {
        output.writeMessage(1, getInitialDrawAt());
      }
      if (drawDelta_ != null) {
        output.writeMessage(2, getDrawDelta());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (initialDrawAt_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getInitialDrawAt());
      }
      if (drawDelta_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getDrawDelta());
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
      if (!(obj instanceof com.lum.network.millions.DrawScheduleProto.DrawSchedule)) {
        return super.equals(obj);
      }
      com.lum.network.millions.DrawScheduleProto.DrawSchedule other = (com.lum.network.millions.DrawScheduleProto.DrawSchedule) obj;

      if (hasInitialDrawAt() != other.hasInitialDrawAt()) return false;
      if (hasInitialDrawAt()) {
        if (!getInitialDrawAt()
            .equals(other.getInitialDrawAt())) return false;
      }
      if (hasDrawDelta() != other.hasDrawDelta()) return false;
      if (hasDrawDelta()) {
        if (!getDrawDelta()
            .equals(other.getDrawDelta())) return false;
      }
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
      if (hasInitialDrawAt()) {
        hash = (37 * hash) + INITIAL_DRAW_AT_FIELD_NUMBER;
        hash = (53 * hash) + getInitialDrawAt().hashCode();
      }
      if (hasDrawDelta()) {
        hash = (37 * hash) + DRAW_DELTA_FIELD_NUMBER;
        hash = (53 * hash) + getDrawDelta().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule parseFrom(
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
    public static Builder newBuilder(com.lum.network.millions.DrawScheduleProto.DrawSchedule prototype) {
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
     * Protobuf type {@code lum.network.millions.DrawSchedule}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:lum.network.millions.DrawSchedule)
        com.lum.network.millions.DrawScheduleProto.DrawScheduleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lum.network.millions.DrawScheduleProto.internal_static_lum_network_millions_DrawSchedule_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lum.network.millions.DrawScheduleProto.internal_static_lum_network_millions_DrawSchedule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lum.network.millions.DrawScheduleProto.DrawSchedule.class, com.lum.network.millions.DrawScheduleProto.DrawSchedule.Builder.class);
      }

      // Construct using com.lum.network.millions.DrawScheduleProto.DrawSchedule.newBuilder()
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
        initialDrawAt_ = null;
        if (initialDrawAtBuilder_ != null) {
          initialDrawAtBuilder_.dispose();
          initialDrawAtBuilder_ = null;
        }
        drawDelta_ = null;
        if (drawDeltaBuilder_ != null) {
          drawDeltaBuilder_.dispose();
          drawDeltaBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lum.network.millions.DrawScheduleProto.internal_static_lum_network_millions_DrawSchedule_descriptor;
      }

      @java.lang.Override
      public com.lum.network.millions.DrawScheduleProto.DrawSchedule getDefaultInstanceForType() {
        return com.lum.network.millions.DrawScheduleProto.DrawSchedule.getDefaultInstance();
      }

      @java.lang.Override
      public com.lum.network.millions.DrawScheduleProto.DrawSchedule build() {
        com.lum.network.millions.DrawScheduleProto.DrawSchedule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.lum.network.millions.DrawScheduleProto.DrawSchedule buildPartial() {
        com.lum.network.millions.DrawScheduleProto.DrawSchedule result = new com.lum.network.millions.DrawScheduleProto.DrawSchedule(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.lum.network.millions.DrawScheduleProto.DrawSchedule result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.initialDrawAt_ = initialDrawAtBuilder_ == null
              ? initialDrawAt_
              : initialDrawAtBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.drawDelta_ = drawDeltaBuilder_ == null
              ? drawDelta_
              : drawDeltaBuilder_.build();
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
        if (other instanceof com.lum.network.millions.DrawScheduleProto.DrawSchedule) {
          return mergeFrom((com.lum.network.millions.DrawScheduleProto.DrawSchedule)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lum.network.millions.DrawScheduleProto.DrawSchedule other) {
        if (other == com.lum.network.millions.DrawScheduleProto.DrawSchedule.getDefaultInstance()) return this;
        if (other.hasInitialDrawAt()) {
          mergeInitialDrawAt(other.getInitialDrawAt());
        }
        if (other.hasDrawDelta()) {
          mergeDrawDelta(other.getDrawDelta());
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
                input.readMessage(
                    getInitialDrawAtFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getDrawDeltaFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private com.google.protobuf.Timestamp initialDrawAt_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> initialDrawAtBuilder_;
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       * @return Whether the initialDrawAt field is set.
       */
      public boolean hasInitialDrawAt() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       * @return The initialDrawAt.
       */
      public com.google.protobuf.Timestamp getInitialDrawAt() {
        if (initialDrawAtBuilder_ == null) {
          return initialDrawAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : initialDrawAt_;
        } else {
          return initialDrawAtBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder setInitialDrawAt(com.google.protobuf.Timestamp value) {
        if (initialDrawAtBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          initialDrawAt_ = value;
        } else {
          initialDrawAtBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder setInitialDrawAt(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (initialDrawAtBuilder_ == null) {
          initialDrawAt_ = builderForValue.build();
        } else {
          initialDrawAtBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder mergeInitialDrawAt(com.google.protobuf.Timestamp value) {
        if (initialDrawAtBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            initialDrawAt_ != null &&
            initialDrawAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
            getInitialDrawAtBuilder().mergeFrom(value);
          } else {
            initialDrawAt_ = value;
          }
        } else {
          initialDrawAtBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder clearInitialDrawAt() {
        bitField0_ = (bitField0_ & ~0x00000001);
        initialDrawAt_ = null;
        if (initialDrawAtBuilder_ != null) {
          initialDrawAtBuilder_.dispose();
          initialDrawAtBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public com.google.protobuf.Timestamp.Builder getInitialDrawAtBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getInitialDrawAtFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public com.google.protobuf.TimestampOrBuilder getInitialDrawAtOrBuilder() {
        if (initialDrawAtBuilder_ != null) {
          return initialDrawAtBuilder_.getMessageOrBuilder();
        } else {
          return initialDrawAt_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : initialDrawAt_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp initial_draw_at = 1 [json_name = "initialDrawAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getInitialDrawAtFieldBuilder() {
        if (initialDrawAtBuilder_ == null) {
          initialDrawAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getInitialDrawAt(),
                  getParentForChildren(),
                  isClean());
          initialDrawAt_ = null;
        }
        return initialDrawAtBuilder_;
      }

      private com.google.protobuf.Duration drawDelta_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> drawDeltaBuilder_;
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       * @return Whether the drawDelta field is set.
       */
      public boolean hasDrawDelta() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       * @return The drawDelta.
       */
      public com.google.protobuf.Duration getDrawDelta() {
        if (drawDeltaBuilder_ == null) {
          return drawDelta_ == null ? com.google.protobuf.Duration.getDefaultInstance() : drawDelta_;
        } else {
          return drawDeltaBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder setDrawDelta(com.google.protobuf.Duration value) {
        if (drawDeltaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          drawDelta_ = value;
        } else {
          drawDeltaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder setDrawDelta(
          com.google.protobuf.Duration.Builder builderForValue) {
        if (drawDeltaBuilder_ == null) {
          drawDelta_ = builderForValue.build();
        } else {
          drawDeltaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder mergeDrawDelta(com.google.protobuf.Duration value) {
        if (drawDeltaBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            drawDelta_ != null &&
            drawDelta_ != com.google.protobuf.Duration.getDefaultInstance()) {
            getDrawDeltaBuilder().mergeFrom(value);
          } else {
            drawDelta_ = value;
          }
        } else {
          drawDeltaBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public Builder clearDrawDelta() {
        bitField0_ = (bitField0_ & ~0x00000002);
        drawDelta_ = null;
        if (drawDeltaBuilder_ != null) {
          drawDeltaBuilder_.dispose();
          drawDeltaBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public com.google.protobuf.Duration.Builder getDrawDeltaBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getDrawDeltaFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      public com.google.protobuf.DurationOrBuilder getDrawDeltaOrBuilder() {
        if (drawDeltaBuilder_ != null) {
          return drawDeltaBuilder_.getMessageOrBuilder();
        } else {
          return drawDelta_ == null ?
              com.google.protobuf.Duration.getDefaultInstance() : drawDelta_;
        }
      }
      /**
       * <code>.google.protobuf.Duration draw_delta = 2 [json_name = "drawDelta", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
          getDrawDeltaFieldBuilder() {
        if (drawDeltaBuilder_ == null) {
          drawDeltaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                  getDrawDelta(),
                  getParentForChildren(),
                  isClean());
          drawDelta_ = null;
        }
        return drawDeltaBuilder_;
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


      // @@protoc_insertion_point(builder_scope:lum.network.millions.DrawSchedule)
    }

    // @@protoc_insertion_point(class_scope:lum.network.millions.DrawSchedule)
    private static final com.lum.network.millions.DrawScheduleProto.DrawSchedule DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.lum.network.millions.DrawScheduleProto.DrawSchedule();
    }

    public static com.lum.network.millions.DrawScheduleProto.DrawSchedule getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DrawSchedule>
        PARSER = new com.google.protobuf.AbstractParser<DrawSchedule>() {
      @java.lang.Override
      public DrawSchedule parsePartialFrom(
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

    public static com.google.protobuf.Parser<DrawSchedule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DrawSchedule> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.lum.network.millions.DrawScheduleProto.DrawSchedule getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lum_network_millions_DrawSchedule_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lum_network_millions_DrawSchedule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(lum-network/millions/draw_schedule.pro" +
      "to\022\024lum.network.millions\032\024gogoproto/gogo" +
      ".proto\032\036google/protobuf/duration.proto\032\037" +
      "google/protobuf/timestamp.proto\"\240\001\n\014Draw" +
      "Schedule\022L\n\017initial_draw_at\030\001 \001(\0132\032.goog" +
      "le.protobuf.TimestampB\010\310\336\037\000\220\337\037\001R\rinitial" +
      "DrawAt\022B\n\ndraw_delta\030\002 \001(\0132\031.google.prot" +
      "obuf.DurationB\010\310\336\037\000\230\337\037\001R\tdrawDeltaB\314\001\n\030c" +
      "om.lum.network.millionsB\021DrawSchedulePro" +
      "toZ-github.com/lum-network/chain/x/milli" +
      "ons/types\242\002\003LNM\252\002\024Lum.Network.Millions\312\002" +
      "\024Lum\\Network\\Millions\342\002 Lum\\Network\\Mill" +
      "ions\\GPBMetadata\352\002\026Lum::Network::Million" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_lum_network_millions_DrawSchedule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lum_network_millions_DrawSchedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lum_network_millions_DrawSchedule_descriptor,
        new java.lang.String[] { "InitialDrawAt", "DrawDelta", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
