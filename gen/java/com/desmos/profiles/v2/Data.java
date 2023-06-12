// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v2/models_app_links.proto

package com.desmos.profiles.v2;

/**
 * <pre>
 * Data contains the data associated to a specific user of a
 * generic centralized application
 * </pre>
 *
 * Protobuf type {@code desmos.profiles.v2.Data}
 */
public final class Data extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.profiles.v2.Data)
    DataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Data.newBuilder() to construct.
  private Data(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Data() {
    application_ = "";
    username_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Data();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.profiles.v2.ModelsAppLinksProto.internal_static_desmos_profiles_v2_Data_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.profiles.v2.ModelsAppLinksProto.internal_static_desmos_profiles_v2_Data_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.profiles.v2.Data.class, com.desmos.profiles.v2.Data.Builder.class);
  }

  public static final int APPLICATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object application_ = "";
  /**
   * <pre>
   * The application name (eg. Twitter, GitHub, etc)
   * </pre>
   *
   * <code>string application = 1 [json_name = "application", (.gogoproto.moretags) = "yaml:&#92;"application&#92;""];</code>
   * @return The application.
   */
  @java.lang.Override
  public java.lang.String getApplication() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      application_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The application name (eg. Twitter, GitHub, etc)
   * </pre>
   *
   * <code>string application = 1 [json_name = "application", (.gogoproto.moretags) = "yaml:&#92;"application&#92;""];</code>
   * @return The bytes for application.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationBytes() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      application_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";
  /**
   * <pre>
   * Username on the application (eg. Twitter tag, GitHub profile, etc)
   * </pre>
   *
   * <code>string username = 2 [json_name = "username", (.gogoproto.moretags) = "yaml:&#92;"username&#92;""];</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Username on the application (eg. Twitter tag, GitHub profile, etc)
   * </pre>
   *
   * <code>string username = 2 [json_name = "username", (.gogoproto.moretags) = "yaml:&#92;"username&#92;""];</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(application_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, application_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(application_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, application_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
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
    if (!(obj instanceof com.desmos.profiles.v2.Data)) {
      return super.equals(obj);
    }
    com.desmos.profiles.v2.Data other = (com.desmos.profiles.v2.Data) obj;

    if (!getApplication()
        .equals(other.getApplication())) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
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
    hash = (37 * hash) + APPLICATION_FIELD_NUMBER;
    hash = (53 * hash) + getApplication().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.profiles.v2.Data parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v2.Data parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v2.Data parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v2.Data parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v2.Data parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v2.Data parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v2.Data parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v2.Data parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.profiles.v2.Data parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.profiles.v2.Data parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.profiles.v2.Data parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v2.Data parseFrom(
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
  public static Builder newBuilder(com.desmos.profiles.v2.Data prototype) {
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
   * Data contains the data associated to a specific user of a
   * generic centralized application
   * </pre>
   *
   * Protobuf type {@code desmos.profiles.v2.Data}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.profiles.v2.Data)
      com.desmos.profiles.v2.DataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.profiles.v2.ModelsAppLinksProto.internal_static_desmos_profiles_v2_Data_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.profiles.v2.ModelsAppLinksProto.internal_static_desmos_profiles_v2_Data_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.profiles.v2.Data.class, com.desmos.profiles.v2.Data.Builder.class);
    }

    // Construct using com.desmos.profiles.v2.Data.newBuilder()
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
      application_ = "";
      username_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.profiles.v2.ModelsAppLinksProto.internal_static_desmos_profiles_v2_Data_descriptor;
    }

    @java.lang.Override
    public com.desmos.profiles.v2.Data getDefaultInstanceForType() {
      return com.desmos.profiles.v2.Data.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.profiles.v2.Data build() {
      com.desmos.profiles.v2.Data result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.profiles.v2.Data buildPartial() {
      com.desmos.profiles.v2.Data result = new com.desmos.profiles.v2.Data(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.profiles.v2.Data result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.application_ = application_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.username_ = username_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.profiles.v2.Data) {
        return mergeFrom((com.desmos.profiles.v2.Data)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.profiles.v2.Data other) {
      if (other == com.desmos.profiles.v2.Data.getDefaultInstance()) return this;
      if (!other.getApplication().isEmpty()) {
        application_ = other.application_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              application_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              username_ = input.readStringRequireUtf8();
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

    private java.lang.Object application_ = "";
    /**
     * <pre>
     * The application name (eg. Twitter, GitHub, etc)
     * </pre>
     *
     * <code>string application = 1 [json_name = "application", (.gogoproto.moretags) = "yaml:&#92;"application&#92;""];</code>
     * @return The application.
     */
    public java.lang.String getApplication() {
      java.lang.Object ref = application_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        application_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The application name (eg. Twitter, GitHub, etc)
     * </pre>
     *
     * <code>string application = 1 [json_name = "application", (.gogoproto.moretags) = "yaml:&#92;"application&#92;""];</code>
     * @return The bytes for application.
     */
    public com.google.protobuf.ByteString
        getApplicationBytes() {
      java.lang.Object ref = application_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        application_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The application name (eg. Twitter, GitHub, etc)
     * </pre>
     *
     * <code>string application = 1 [json_name = "application", (.gogoproto.moretags) = "yaml:&#92;"application&#92;""];</code>
     * @param value The application to set.
     * @return This builder for chaining.
     */
    public Builder setApplication(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      application_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The application name (eg. Twitter, GitHub, etc)
     * </pre>
     *
     * <code>string application = 1 [json_name = "application", (.gogoproto.moretags) = "yaml:&#92;"application&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearApplication() {
      application_ = getDefaultInstance().getApplication();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The application name (eg. Twitter, GitHub, etc)
     * </pre>
     *
     * <code>string application = 1 [json_name = "application", (.gogoproto.moretags) = "yaml:&#92;"application&#92;""];</code>
     * @param value The bytes for application to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      application_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <pre>
     * Username on the application (eg. Twitter tag, GitHub profile, etc)
     * </pre>
     *
     * <code>string username = 2 [json_name = "username", (.gogoproto.moretags) = "yaml:&#92;"username&#92;""];</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Username on the application (eg. Twitter tag, GitHub profile, etc)
     * </pre>
     *
     * <code>string username = 2 [json_name = "username", (.gogoproto.moretags) = "yaml:&#92;"username&#92;""];</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Username on the application (eg. Twitter tag, GitHub profile, etc)
     * </pre>
     *
     * <code>string username = 2 [json_name = "username", (.gogoproto.moretags) = "yaml:&#92;"username&#92;""];</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      username_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Username on the application (eg. Twitter tag, GitHub profile, etc)
     * </pre>
     *
     * <code>string username = 2 [json_name = "username", (.gogoproto.moretags) = "yaml:&#92;"username&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Username on the application (eg. Twitter tag, GitHub profile, etc)
     * </pre>
     *
     * <code>string username = 2 [json_name = "username", (.gogoproto.moretags) = "yaml:&#92;"username&#92;""];</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:desmos.profiles.v2.Data)
  }

  // @@protoc_insertion_point(class_scope:desmos.profiles.v2.Data)
  private static final com.desmos.profiles.v2.Data DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.profiles.v2.Data();
  }

  public static com.desmos.profiles.v2.Data getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Data>
      PARSER = new com.google.protobuf.AbstractParser<Data>() {
    @java.lang.Override
    public Data parsePartialFrom(
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

  public static com.google.protobuf.Parser<Data> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Data> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.profiles.v2.Data getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

