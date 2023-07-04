// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/utils/v1beta1/threshold.proto

package com.axelar.utils.v1beta1;

public final class ThresholdProto {
  private ThresholdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ThresholdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:axelar.utils.v1beta1.Threshold)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * split threshold into Numerator and denominator to avoid floating point
     * errors down the line
     * </pre>
     *
     * <code>int64 numerator = 1 [json_name = "numerator"];</code>
     * @return The numerator.
     */
    long getNumerator();

    /**
     * <code>int64 denominator = 2 [json_name = "denominator"];</code>
     * @return The denominator.
     */
    long getDenominator();
  }
  /**
   * Protobuf type {@code axelar.utils.v1beta1.Threshold}
   */
  public static final class Threshold extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:axelar.utils.v1beta1.Threshold)
      ThresholdOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Threshold.newBuilder() to construct.
    private Threshold(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Threshold() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Threshold();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.utils.v1beta1.ThresholdProto.internal_static_axelar_utils_v1beta1_Threshold_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.utils.v1beta1.ThresholdProto.internal_static_axelar_utils_v1beta1_Threshold_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.utils.v1beta1.ThresholdProto.Threshold.class, com.axelar.utils.v1beta1.ThresholdProto.Threshold.Builder.class);
    }

    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private long numerator_ = 0L;
    /**
     * <pre>
     * split threshold into Numerator and denominator to avoid floating point
     * errors down the line
     * </pre>
     *
     * <code>int64 numerator = 1 [json_name = "numerator"];</code>
     * @return The numerator.
     */
    @java.lang.Override
    public long getNumerator() {
      return numerator_;
    }

    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    private long denominator_ = 0L;
    /**
     * <code>int64 denominator = 2 [json_name = "denominator"];</code>
     * @return The denominator.
     */
    @java.lang.Override
    public long getDenominator() {
      return denominator_;
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
      if (numerator_ != 0L) {
        output.writeInt64(1, numerator_);
      }
      if (denominator_ != 0L) {
        output.writeInt64(2, denominator_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (numerator_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, numerator_);
      }
      if (denominator_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, denominator_);
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
      if (!(obj instanceof com.axelar.utils.v1beta1.ThresholdProto.Threshold)) {
        return super.equals(obj);
      }
      com.axelar.utils.v1beta1.ThresholdProto.Threshold other = (com.axelar.utils.v1beta1.ThresholdProto.Threshold) obj;

      if (getNumerator()
          != other.getNumerator()) return false;
      if (getDenominator()
          != other.getDenominator()) return false;
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
      hash = (37 * hash) + NUMERATOR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNumerator());
      hash = (37 * hash) + DENOMINATOR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDenominator());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold parseFrom(
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
    public static Builder newBuilder(com.axelar.utils.v1beta1.ThresholdProto.Threshold prototype) {
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
     * Protobuf type {@code axelar.utils.v1beta1.Threshold}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:axelar.utils.v1beta1.Threshold)
        com.axelar.utils.v1beta1.ThresholdProto.ThresholdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.axelar.utils.v1beta1.ThresholdProto.internal_static_axelar_utils_v1beta1_Threshold_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.axelar.utils.v1beta1.ThresholdProto.internal_static_axelar_utils_v1beta1_Threshold_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.axelar.utils.v1beta1.ThresholdProto.Threshold.class, com.axelar.utils.v1beta1.ThresholdProto.Threshold.Builder.class);
      }

      // Construct using com.axelar.utils.v1beta1.ThresholdProto.Threshold.newBuilder()
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
        numerator_ = 0L;
        denominator_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.axelar.utils.v1beta1.ThresholdProto.internal_static_axelar_utils_v1beta1_Threshold_descriptor;
      }

      @java.lang.Override
      public com.axelar.utils.v1beta1.ThresholdProto.Threshold getDefaultInstanceForType() {
        return com.axelar.utils.v1beta1.ThresholdProto.Threshold.getDefaultInstance();
      }

      @java.lang.Override
      public com.axelar.utils.v1beta1.ThresholdProto.Threshold build() {
        com.axelar.utils.v1beta1.ThresholdProto.Threshold result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.axelar.utils.v1beta1.ThresholdProto.Threshold buildPartial() {
        com.axelar.utils.v1beta1.ThresholdProto.Threshold result = new com.axelar.utils.v1beta1.ThresholdProto.Threshold(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.axelar.utils.v1beta1.ThresholdProto.Threshold result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.numerator_ = numerator_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.denominator_ = denominator_;
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
        if (other instanceof com.axelar.utils.v1beta1.ThresholdProto.Threshold) {
          return mergeFrom((com.axelar.utils.v1beta1.ThresholdProto.Threshold)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.axelar.utils.v1beta1.ThresholdProto.Threshold other) {
        if (other == com.axelar.utils.v1beta1.ThresholdProto.Threshold.getDefaultInstance()) return this;
        if (other.getNumerator() != 0L) {
          setNumerator(other.getNumerator());
        }
        if (other.getDenominator() != 0L) {
          setDenominator(other.getDenominator());
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
              case 8: {
                numerator_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                denominator_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private long numerator_ ;
      /**
       * <pre>
       * split threshold into Numerator and denominator to avoid floating point
       * errors down the line
       * </pre>
       *
       * <code>int64 numerator = 1 [json_name = "numerator"];</code>
       * @return The numerator.
       */
      @java.lang.Override
      public long getNumerator() {
        return numerator_;
      }
      /**
       * <pre>
       * split threshold into Numerator and denominator to avoid floating point
       * errors down the line
       * </pre>
       *
       * <code>int64 numerator = 1 [json_name = "numerator"];</code>
       * @param value The numerator to set.
       * @return This builder for chaining.
       */
      public Builder setNumerator(long value) {

        numerator_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * split threshold into Numerator and denominator to avoid floating point
       * errors down the line
       * </pre>
       *
       * <code>int64 numerator = 1 [json_name = "numerator"];</code>
       * @return This builder for chaining.
       */
      public Builder clearNumerator() {
        bitField0_ = (bitField0_ & ~0x00000001);
        numerator_ = 0L;
        onChanged();
        return this;
      }

      private long denominator_ ;
      /**
       * <code>int64 denominator = 2 [json_name = "denominator"];</code>
       * @return The denominator.
       */
      @java.lang.Override
      public long getDenominator() {
        return denominator_;
      }
      /**
       * <code>int64 denominator = 2 [json_name = "denominator"];</code>
       * @param value The denominator to set.
       * @return This builder for chaining.
       */
      public Builder setDenominator(long value) {

        denominator_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int64 denominator = 2 [json_name = "denominator"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDenominator() {
        bitField0_ = (bitField0_ & ~0x00000002);
        denominator_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:axelar.utils.v1beta1.Threshold)
    }

    // @@protoc_insertion_point(class_scope:axelar.utils.v1beta1.Threshold)
    private static final com.axelar.utils.v1beta1.ThresholdProto.Threshold DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.axelar.utils.v1beta1.ThresholdProto.Threshold();
    }

    public static com.axelar.utils.v1beta1.ThresholdProto.Threshold getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Threshold>
        PARSER = new com.google.protobuf.AbstractParser<Threshold>() {
      @java.lang.Override
      public Threshold parsePartialFrom(
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

    public static com.google.protobuf.Parser<Threshold> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Threshold> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.axelar.utils.v1beta1.ThresholdProto.Threshold getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_utils_v1beta1_Threshold_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_utils_v1beta1_Threshold_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$axelar/utils/v1beta1/threshold.proto\022\024" +
      "axelar.utils.v1beta1\032\024gogoproto/gogo.pro" +
      "to\"Q\n\tThreshold\022\034\n\tnumerator\030\001 \001(\003R\tnume" +
      "rator\022 \n\013denominator\030\002 \001(\003R\013denominator:" +
      "\004\230\240\037\000B\312\001\n\030com.axelar.utils.v1beta1B\016Thre" +
      "sholdProtoZ*github.com/axelarnetwork/axe" +
      "lar-core/utils\242\002\003AUX\252\002\024Axelar.Utils.V1be" +
      "ta1\312\002\024Axelar\\Utils\\V1beta1\342\002 Axelar\\Util" +
      "s\\V1beta1\\GPBMetadata\352\002\026Axelar::Utils::V" +
      "1beta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_axelar_utils_v1beta1_Threshold_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_utils_v1beta1_Threshold_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_utils_v1beta1_Threshold_descriptor,
        new java.lang.String[] { "Numerator", "Denominator", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}