// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/transactions/define/transaction_response.proto

package com.assetmantle.modules.identities.transactions.define;

public final class TransactionResponseProto {
  private TransactionResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TransactionResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.modules.identities.transactions.define.TransactionResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return Whether the classificationID field is set.
     */
    boolean hasClassificationID();
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return The classificationID.
     */
    com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID getClassificationID();
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder getClassificationIDOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.modules.identities.transactions.define.TransactionResponse}
   */
  public static final class TransactionResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.modules.identities.transactions.define.TransactionResponse)
      TransactionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransactionResponse.newBuilder() to construct.
    private TransactionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransactionResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TransactionResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse.class, com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse.Builder.class);
    }

    public static final int CLASSIFICATION_I_D_FIELD_NUMBER = 1;
    private com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID classificationID_;
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return Whether the classificationID field is set.
     */
    @java.lang.Override
    public boolean hasClassificationID() {
      return classificationID_ != null;
    }
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return The classificationID.
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID getClassificationID() {
      return classificationID_ == null ? com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance() : classificationID_;
    }
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
      return classificationID_ == null ? com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance() : classificationID_;
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
      if (classificationID_ != null) {
        output.writeMessage(1, getClassificationID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (classificationID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getClassificationID());
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
      if (!(obj instanceof com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse)) {
        return super.equals(obj);
      }
      com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse other = (com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse) obj;

      if (hasClassificationID() != other.hasClassificationID()) return false;
      if (hasClassificationID()) {
        if (!getClassificationID()
            .equals(other.getClassificationID())) return false;
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
      if (hasClassificationID()) {
        hash = (37 * hash) + CLASSIFICATION_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getClassificationID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse parseFrom(
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
    public static Builder newBuilder(com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse prototype) {
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
     * Protobuf type {@code assetmantle.modules.identities.transactions.define.TransactionResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.modules.identities.transactions.define.TransactionResponse)
        com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse.class, com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse.Builder.class);
      }

      // Construct using com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse.newBuilder()
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
        classificationID_ = null;
        if (classificationIDBuilder_ != null) {
          classificationIDBuilder_.dispose();
          classificationIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse getDefaultInstanceForType() {
        return com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse build() {
        com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse buildPartial() {
        com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse result = new com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.classificationID_ = classificationIDBuilder_ == null
              ? classificationID_
              : classificationIDBuilder_.build();
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
        if (other instanceof com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse) {
          return mergeFrom((com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse other) {
        if (other == com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse.getDefaultInstance()) return this;
        if (other.hasClassificationID()) {
          mergeClassificationID(other.getClassificationID());
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
                    getClassificationIDFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

      private com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID classificationID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder> classificationIDBuilder_;
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       * @return Whether the classificationID field is set.
       */
      public boolean hasClassificationID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       * @return The classificationID.
       */
      public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID getClassificationID() {
        if (classificationIDBuilder_ == null) {
          return classificationID_ == null ? com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance() : classificationID_;
        } else {
          return classificationIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public Builder setClassificationID(com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID value) {
        if (classificationIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          classificationID_ = value;
        } else {
          classificationIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public Builder setClassificationID(
          com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder builderForValue) {
        if (classificationIDBuilder_ == null) {
          classificationID_ = builderForValue.build();
        } else {
          classificationIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public Builder mergeClassificationID(com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID value) {
        if (classificationIDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            classificationID_ != null &&
            classificationID_ != com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance()) {
            getClassificationIDBuilder().mergeFrom(value);
          } else {
            classificationID_ = value;
          }
        } else {
          classificationIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public Builder clearClassificationID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        classificationID_ = null;
        if (classificationIDBuilder_ != null) {
          classificationIDBuilder_.dispose();
          classificationIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder getClassificationIDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getClassificationIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
        if (classificationIDBuilder_ != null) {
          return classificationIDBuilder_.getMessageOrBuilder();
        } else {
          return classificationID_ == null ?
              com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance() : classificationID_;
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder> 
          getClassificationIDFieldBuilder() {
        if (classificationIDBuilder_ == null) {
          classificationIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder>(
                  getClassificationID(),
                  getParentForChildren(),
                  isClean());
          classificationID_ = null;
        }
        return classificationIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.modules.identities.transactions.define.TransactionResponse)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.modules.identities.transactions.define.TransactionResponse)
    private static final com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse();
    }

    public static com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TransactionResponse>
        PARSER = new com.google.protobuf.AbstractParser<TransactionResponse>() {
      @java.lang.Override
      public TransactionResponse parsePartialFrom(
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

    public static com.google.protobuf.Parser<TransactionResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TransactionResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.transactions.define.TransactionResponseProto.TransactionResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEassetmantle/identities/transactions/de" +
      "fine/transaction_response.proto\0222assetma" +
      "ntle.modules.identities.transactions.def" +
      "ine\032,assetmantle/ids/base/classification" +
      "_id.proto\"r\n\023TransactionResponse\022[\n\022clas" +
      "sification_i_d\030\001 \001(\0132-.assetmantle.schem" +
      "a.ids.base.ClassificationIDR\020classificat" +
      "ionIDB\276\002\n6com.assetmantle.modules.identi" +
      "ties.transactions.defineB\030TransactionRes" +
      "ponseProto\242\002\005AMITD\252\0022Assetmantle.Modules" +
      ".Identities.Transactions.Define\312\0022Assetm" +
      "antle\\Modules\\Identities\\Transactions\\De" +
      "fine\342\002>Assetmantle\\Modules\\Identities\\Tr" +
      "ansactions\\Define\\GPBMetadata\352\0026Assetman" +
      "tle::Modules::Identities::Transactions::" +
      "Defineb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_identities_transactions_define_TransactionResponse_descriptor,
        new java.lang.String[] { "ClassificationID", });
    com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
