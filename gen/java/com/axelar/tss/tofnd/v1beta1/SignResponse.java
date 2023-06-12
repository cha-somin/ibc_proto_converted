// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/tss/tofnd/v1beta1/multisig.proto

package com.axelar.tss.tofnd.v1beta1;

/**
 * Protobuf type {@code axelar.tss.tofnd.v1beta1.SignResponse}
 */
public final class SignResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.tss.tofnd.v1beta1.SignResponse)
    SignResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignResponse.newBuilder() to construct.
  private SignResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SignResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.tss.tofnd.v1beta1.SignResponse.class, com.axelar.tss.tofnd.v1beta1.SignResponse.Builder.class);
  }

  private int signResponseCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object signResponse_;
  public enum SignResponseCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SIGNATURE(1),
    ERROR(2),
    SIGNRESPONSE_NOT_SET(0);
    private final int value;
    private SignResponseCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SignResponseCase valueOf(int value) {
      return forNumber(value);
    }

    public static SignResponseCase forNumber(int value) {
      switch (value) {
        case 1: return SIGNATURE;
        case 2: return ERROR;
        case 0: return SIGNRESPONSE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SignResponseCase
  getSignResponseCase() {
    return SignResponseCase.forNumber(
        signResponseCase_);
  }

  public static final int SIGNATURE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * ASN.1 DER-encoded ECDSA signature
   * </pre>
   *
   * <code>bytes signature = 1 [json_name = "signature"];</code>
   * @return Whether the signature field is set.
   */
  @java.lang.Override
  public boolean hasSignature() {
    return signResponseCase_ == 1;
  }
  /**
   * <pre>
   * ASN.1 DER-encoded ECDSA signature
   * </pre>
   *
   * <code>bytes signature = 1 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    if (signResponseCase_ == 1) {
      return (com.google.protobuf.ByteString) signResponse_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  /**
   * <pre>
   * reply with an error message if sign fails
   * </pre>
   *
   * <code>string error = 2 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  public boolean hasError() {
    return signResponseCase_ == 2;
  }
  /**
   * <pre>
   * reply with an error message if sign fails
   * </pre>
   *
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  public java.lang.String getError() {
    java.lang.Object ref = "";
    if (signResponseCase_ == 2) {
      ref = signResponse_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (signResponseCase_ == 2) {
        signResponse_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * reply with an error message if sign fails
   * </pre>
   *
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = "";
    if (signResponseCase_ == 2) {
      ref = signResponse_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (signResponseCase_ == 2) {
        signResponse_ = b;
      }
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
    if (signResponseCase_ == 1) {
      output.writeBytes(
          1, (com.google.protobuf.ByteString) signResponse_);
    }
    if (signResponseCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, signResponse_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (signResponseCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            1, (com.google.protobuf.ByteString) signResponse_);
    }
    if (signResponseCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, signResponse_);
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
    if (!(obj instanceof com.axelar.tss.tofnd.v1beta1.SignResponse)) {
      return super.equals(obj);
    }
    com.axelar.tss.tofnd.v1beta1.SignResponse other = (com.axelar.tss.tofnd.v1beta1.SignResponse) obj;

    if (!getSignResponseCase().equals(other.getSignResponseCase())) return false;
    switch (signResponseCase_) {
      case 1:
        if (!getSignature()
            .equals(other.getSignature())) return false;
        break;
      case 2:
        if (!getError()
            .equals(other.getError())) return false;
        break;
      case 0:
      default:
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
    switch (signResponseCase_) {
      case 1:
        hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
        hash = (53 * hash) + getSignature().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignResponse parseFrom(
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
  public static Builder newBuilder(com.axelar.tss.tofnd.v1beta1.SignResponse prototype) {
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
   * Protobuf type {@code axelar.tss.tofnd.v1beta1.SignResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.tss.tofnd.v1beta1.SignResponse)
      com.axelar.tss.tofnd.v1beta1.SignResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.tss.tofnd.v1beta1.SignResponse.class, com.axelar.tss.tofnd.v1beta1.SignResponse.Builder.class);
    }

    // Construct using com.axelar.tss.tofnd.v1beta1.SignResponse.newBuilder()
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
      signResponseCase_ = 0;
      signResponse_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignResponse_descriptor;
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.SignResponse getDefaultInstanceForType() {
      return com.axelar.tss.tofnd.v1beta1.SignResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.SignResponse build() {
      com.axelar.tss.tofnd.v1beta1.SignResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.SignResponse buildPartial() {
      com.axelar.tss.tofnd.v1beta1.SignResponse result = new com.axelar.tss.tofnd.v1beta1.SignResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.tss.tofnd.v1beta1.SignResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.axelar.tss.tofnd.v1beta1.SignResponse result) {
      result.signResponseCase_ = signResponseCase_;
      result.signResponse_ = this.signResponse_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.tss.tofnd.v1beta1.SignResponse) {
        return mergeFrom((com.axelar.tss.tofnd.v1beta1.SignResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.tss.tofnd.v1beta1.SignResponse other) {
      if (other == com.axelar.tss.tofnd.v1beta1.SignResponse.getDefaultInstance()) return this;
      switch (other.getSignResponseCase()) {
        case SIGNATURE: {
          setSignature(other.getSignature());
          break;
        }
        case ERROR: {
          signResponseCase_ = 2;
          signResponse_ = other.signResponse_;
          onChanged();
          break;
        }
        case SIGNRESPONSE_NOT_SET: {
          break;
        }
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
              signResponse_ = input.readBytes();
              signResponseCase_ = 1;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              signResponseCase_ = 2;
              signResponse_ = s;
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
    private int signResponseCase_ = 0;
    private java.lang.Object signResponse_;
    public SignResponseCase
        getSignResponseCase() {
      return SignResponseCase.forNumber(
          signResponseCase_);
    }

    public Builder clearSignResponse() {
      signResponseCase_ = 0;
      signResponse_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * ASN.1 DER-encoded ECDSA signature
     * </pre>
     *
     * <code>bytes signature = 1 [json_name = "signature"];</code>
     * @return Whether the signature field is set.
     */
    public boolean hasSignature() {
      return signResponseCase_ == 1;
    }
    /**
     * <pre>
     * ASN.1 DER-encoded ECDSA signature
     * </pre>
     *
     * <code>bytes signature = 1 [json_name = "signature"];</code>
     * @return The signature.
     */
    public com.google.protobuf.ByteString getSignature() {
      if (signResponseCase_ == 1) {
        return (com.google.protobuf.ByteString) signResponse_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * ASN.1 DER-encoded ECDSA signature
     * </pre>
     *
     * <code>bytes signature = 1 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signResponseCase_ = 1;
      signResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ASN.1 DER-encoded ECDSA signature
     * </pre>
     *
     * <code>bytes signature = 1 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      if (signResponseCase_ == 1) {
        signResponseCase_ = 0;
        signResponse_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * reply with an error message if sign fails
     * </pre>
     *
     * <code>string error = 2 [json_name = "error"];</code>
     * @return Whether the error field is set.
     */
    @java.lang.Override
    public boolean hasError() {
      return signResponseCase_ == 2;
    }
    /**
     * <pre>
     * reply with an error message if sign fails
     * </pre>
     *
     * <code>string error = 2 [json_name = "error"];</code>
     * @return The error.
     */
    @java.lang.Override
    public java.lang.String getError() {
      java.lang.Object ref = "";
      if (signResponseCase_ == 2) {
        ref = signResponse_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (signResponseCase_ == 2) {
          signResponse_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * reply with an error message if sign fails
     * </pre>
     *
     * <code>string error = 2 [json_name = "error"];</code>
     * @return The bytes for error.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = "";
      if (signResponseCase_ == 2) {
        ref = signResponse_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (signResponseCase_ == 2) {
          signResponse_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * reply with an error message if sign fails
     * </pre>
     *
     * <code>string error = 2 [json_name = "error"];</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signResponseCase_ = 2;
      signResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * reply with an error message if sign fails
     * </pre>
     *
     * <code>string error = 2 [json_name = "error"];</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      if (signResponseCase_ == 2) {
        signResponseCase_ = 0;
        signResponse_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * reply with an error message if sign fails
     * </pre>
     *
     * <code>string error = 2 [json_name = "error"];</code>
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signResponseCase_ = 2;
      signResponse_ = value;
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


    // @@protoc_insertion_point(builder_scope:axelar.tss.tofnd.v1beta1.SignResponse)
  }

  // @@protoc_insertion_point(class_scope:axelar.tss.tofnd.v1beta1.SignResponse)
  private static final com.axelar.tss.tofnd.v1beta1.SignResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.tss.tofnd.v1beta1.SignResponse();
  }

  public static com.axelar.tss.tofnd.v1beta1.SignResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignResponse>
      PARSER = new com.google.protobuf.AbstractParser<SignResponse>() {
    @java.lang.Override
    public SignResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.tss.tofnd.v1beta1.SignResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

