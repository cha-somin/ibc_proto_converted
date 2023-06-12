// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/registration/v1beta1/msg.proto

package com.secret.registration.v1beta1;

/**
 * Protobuf type {@code secret.registration.v1beta1.RaAuthenticate}
 */
public final class RaAuthenticate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:secret.registration.v1beta1.RaAuthenticate)
    RaAuthenticateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RaAuthenticate.newBuilder() to construct.
  private RaAuthenticate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RaAuthenticate() {
    sender_ = com.google.protobuf.ByteString.EMPTY;
    certificate_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RaAuthenticate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.secret.registration.v1beta1.MsgProto.internal_static_secret_registration_v1beta1_RaAuthenticate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.secret.registration.v1beta1.MsgProto.internal_static_secret_registration_v1beta1_RaAuthenticate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.secret.registration.v1beta1.RaAuthenticate.class, com.secret.registration.v1beta1.RaAuthenticate.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSender() {
    return sender_;
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString certificate_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes certificate = 2 [json_name = "certificate", (.gogoproto.jsontag) = "ra_cert", (.gogoproto.casttype) = "github.com/scrtlabs/SecretNetwork/x/registration/remote_attestation.Certificate"];</code>
   * @return The certificate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCertificate() {
    return certificate_;
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
    if (!sender_.isEmpty()) {
      output.writeBytes(1, sender_);
    }
    if (!certificate_.isEmpty()) {
      output.writeBytes(2, certificate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!sender_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, sender_);
    }
    if (!certificate_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, certificate_);
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
    if (!(obj instanceof com.secret.registration.v1beta1.RaAuthenticate)) {
      return super.equals(obj);
    }
    com.secret.registration.v1beta1.RaAuthenticate other = (com.secret.registration.v1beta1.RaAuthenticate) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getCertificate()
        .equals(other.getCertificate())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getCertificate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.secret.registration.v1beta1.RaAuthenticate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.secret.registration.v1beta1.RaAuthenticate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.secret.registration.v1beta1.RaAuthenticate parseFrom(
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
  public static Builder newBuilder(com.secret.registration.v1beta1.RaAuthenticate prototype) {
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
   * Protobuf type {@code secret.registration.v1beta1.RaAuthenticate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:secret.registration.v1beta1.RaAuthenticate)
      com.secret.registration.v1beta1.RaAuthenticateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.secret.registration.v1beta1.MsgProto.internal_static_secret_registration_v1beta1_RaAuthenticate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.secret.registration.v1beta1.MsgProto.internal_static_secret_registration_v1beta1_RaAuthenticate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.secret.registration.v1beta1.RaAuthenticate.class, com.secret.registration.v1beta1.RaAuthenticate.Builder.class);
    }

    // Construct using com.secret.registration.v1beta1.RaAuthenticate.newBuilder()
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
      sender_ = com.google.protobuf.ByteString.EMPTY;
      certificate_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.secret.registration.v1beta1.MsgProto.internal_static_secret_registration_v1beta1_RaAuthenticate_descriptor;
    }

    @java.lang.Override
    public com.secret.registration.v1beta1.RaAuthenticate getDefaultInstanceForType() {
      return com.secret.registration.v1beta1.RaAuthenticate.getDefaultInstance();
    }

    @java.lang.Override
    public com.secret.registration.v1beta1.RaAuthenticate build() {
      com.secret.registration.v1beta1.RaAuthenticate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.secret.registration.v1beta1.RaAuthenticate buildPartial() {
      com.secret.registration.v1beta1.RaAuthenticate result = new com.secret.registration.v1beta1.RaAuthenticate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.secret.registration.v1beta1.RaAuthenticate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.certificate_ = certificate_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.secret.registration.v1beta1.RaAuthenticate) {
        return mergeFrom((com.secret.registration.v1beta1.RaAuthenticate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.secret.registration.v1beta1.RaAuthenticate other) {
      if (other == com.secret.registration.v1beta1.RaAuthenticate.getDefaultInstance()) return this;
      if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
        setSender(other.getSender());
      }
      if (other.getCertificate() != com.google.protobuf.ByteString.EMPTY) {
        setCertificate(other.getCertificate());
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
              sender_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              certificate_ = input.readBytes();
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

    private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The sender.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSender() {
      return sender_;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sender_ = getDefaultInstance().getSender();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString certificate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes certificate = 2 [json_name = "certificate", (.gogoproto.jsontag) = "ra_cert", (.gogoproto.casttype) = "github.com/scrtlabs/SecretNetwork/x/registration/remote_attestation.Certificate"];</code>
     * @return The certificate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCertificate() {
      return certificate_;
    }
    /**
     * <code>bytes certificate = 2 [json_name = "certificate", (.gogoproto.jsontag) = "ra_cert", (.gogoproto.casttype) = "github.com/scrtlabs/SecretNetwork/x/registration/remote_attestation.Certificate"];</code>
     * @param value The certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificate(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      certificate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes certificate = 2 [json_name = "certificate", (.gogoproto.jsontag) = "ra_cert", (.gogoproto.casttype) = "github.com/scrtlabs/SecretNetwork/x/registration/remote_attestation.Certificate"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCertificate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      certificate_ = getDefaultInstance().getCertificate();
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


    // @@protoc_insertion_point(builder_scope:secret.registration.v1beta1.RaAuthenticate)
  }

  // @@protoc_insertion_point(class_scope:secret.registration.v1beta1.RaAuthenticate)
  private static final com.secret.registration.v1beta1.RaAuthenticate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.secret.registration.v1beta1.RaAuthenticate();
  }

  public static com.secret.registration.v1beta1.RaAuthenticate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RaAuthenticate>
      PARSER = new com.google.protobuf.AbstractParser<RaAuthenticate>() {
    @java.lang.Override
    public RaAuthenticate parsePartialFrom(
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

  public static com.google.protobuf.Parser<RaAuthenticate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RaAuthenticate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.secret.registration.v1beta1.RaAuthenticate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

