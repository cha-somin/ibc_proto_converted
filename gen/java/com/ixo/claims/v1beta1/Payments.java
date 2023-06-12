// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/claims/v1beta1/claims.proto

package com.ixo.claims.v1beta1;

/**
 * Protobuf type {@code ixo.claims.v1beta1.Payments}
 */
public final class Payments extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.claims.v1beta1.Payments)
    PaymentsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Payments.newBuilder() to construct.
  private Payments(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Payments() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Payments();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.claims.v1beta1.ClaimsProto.internal_static_ixo_claims_v1beta1_Payments_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.claims.v1beta1.ClaimsProto.internal_static_ixo_claims_v1beta1_Payments_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.claims.v1beta1.Payments.class, com.ixo.claims.v1beta1.Payments.Builder.class);
  }

  public static final int SUBMISSION_FIELD_NUMBER = 1;
  private com.ixo.claims.v1beta1.Payment submission_;
  /**
   * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
   * @return Whether the submission field is set.
   */
  @java.lang.Override
  public boolean hasSubmission() {
    return submission_ != null;
  }
  /**
   * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
   * @return The submission.
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.Payment getSubmission() {
    return submission_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : submission_;
  }
  /**
   * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.PaymentOrBuilder getSubmissionOrBuilder() {
    return submission_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : submission_;
  }

  public static final int EVALUATION_FIELD_NUMBER = 2;
  private com.ixo.claims.v1beta1.Payment evaluation_;
  /**
   * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
   * @return Whether the evaluation field is set.
   */
  @java.lang.Override
  public boolean hasEvaluation() {
    return evaluation_ != null;
  }
  /**
   * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
   * @return The evaluation.
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.Payment getEvaluation() {
    return evaluation_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : evaluation_;
  }
  /**
   * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.PaymentOrBuilder getEvaluationOrBuilder() {
    return evaluation_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : evaluation_;
  }

  public static final int APPROVAL_FIELD_NUMBER = 3;
  private com.ixo.claims.v1beta1.Payment approval_;
  /**
   * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
   * @return Whether the approval field is set.
   */
  @java.lang.Override
  public boolean hasApproval() {
    return approval_ != null;
  }
  /**
   * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
   * @return The approval.
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.Payment getApproval() {
    return approval_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : approval_;
  }
  /**
   * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.PaymentOrBuilder getApprovalOrBuilder() {
    return approval_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : approval_;
  }

  public static final int REJECTION_FIELD_NUMBER = 4;
  private com.ixo.claims.v1beta1.Payment rejection_;
  /**
   * <pre>
   * Payment penalty = 5;
   * </pre>
   *
   * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
   * @return Whether the rejection field is set.
   */
  @java.lang.Override
  public boolean hasRejection() {
    return rejection_ != null;
  }
  /**
   * <pre>
   * Payment penalty = 5;
   * </pre>
   *
   * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
   * @return The rejection.
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.Payment getRejection() {
    return rejection_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : rejection_;
  }
  /**
   * <pre>
   * Payment penalty = 5;
   * </pre>
   *
   * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
   */
  @java.lang.Override
  public com.ixo.claims.v1beta1.PaymentOrBuilder getRejectionOrBuilder() {
    return rejection_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : rejection_;
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
    if (submission_ != null) {
      output.writeMessage(1, getSubmission());
    }
    if (evaluation_ != null) {
      output.writeMessage(2, getEvaluation());
    }
    if (approval_ != null) {
      output.writeMessage(3, getApproval());
    }
    if (rejection_ != null) {
      output.writeMessage(4, getRejection());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (submission_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSubmission());
    }
    if (evaluation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEvaluation());
    }
    if (approval_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getApproval());
    }
    if (rejection_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getRejection());
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
    if (!(obj instanceof com.ixo.claims.v1beta1.Payments)) {
      return super.equals(obj);
    }
    com.ixo.claims.v1beta1.Payments other = (com.ixo.claims.v1beta1.Payments) obj;

    if (hasSubmission() != other.hasSubmission()) return false;
    if (hasSubmission()) {
      if (!getSubmission()
          .equals(other.getSubmission())) return false;
    }
    if (hasEvaluation() != other.hasEvaluation()) return false;
    if (hasEvaluation()) {
      if (!getEvaluation()
          .equals(other.getEvaluation())) return false;
    }
    if (hasApproval() != other.hasApproval()) return false;
    if (hasApproval()) {
      if (!getApproval()
          .equals(other.getApproval())) return false;
    }
    if (hasRejection() != other.hasRejection()) return false;
    if (hasRejection()) {
      if (!getRejection()
          .equals(other.getRejection())) return false;
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
    if (hasSubmission()) {
      hash = (37 * hash) + SUBMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getSubmission().hashCode();
    }
    if (hasEvaluation()) {
      hash = (37 * hash) + EVALUATION_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluation().hashCode();
    }
    if (hasApproval()) {
      hash = (37 * hash) + APPROVAL_FIELD_NUMBER;
      hash = (53 * hash) + getApproval().hashCode();
    }
    if (hasRejection()) {
      hash = (37 * hash) + REJECTION_FIELD_NUMBER;
      hash = (53 * hash) + getRejection().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.claims.v1beta1.Payments parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.claims.v1beta1.Payments parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.claims.v1beta1.Payments parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.claims.v1beta1.Payments parseFrom(
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
  public static Builder newBuilder(com.ixo.claims.v1beta1.Payments prototype) {
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
   * Protobuf type {@code ixo.claims.v1beta1.Payments}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.claims.v1beta1.Payments)
      com.ixo.claims.v1beta1.PaymentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.claims.v1beta1.ClaimsProto.internal_static_ixo_claims_v1beta1_Payments_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.claims.v1beta1.ClaimsProto.internal_static_ixo_claims_v1beta1_Payments_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.claims.v1beta1.Payments.class, com.ixo.claims.v1beta1.Payments.Builder.class);
    }

    // Construct using com.ixo.claims.v1beta1.Payments.newBuilder()
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
      submission_ = null;
      if (submissionBuilder_ != null) {
        submissionBuilder_.dispose();
        submissionBuilder_ = null;
      }
      evaluation_ = null;
      if (evaluationBuilder_ != null) {
        evaluationBuilder_.dispose();
        evaluationBuilder_ = null;
      }
      approval_ = null;
      if (approvalBuilder_ != null) {
        approvalBuilder_.dispose();
        approvalBuilder_ = null;
      }
      rejection_ = null;
      if (rejectionBuilder_ != null) {
        rejectionBuilder_.dispose();
        rejectionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.claims.v1beta1.ClaimsProto.internal_static_ixo_claims_v1beta1_Payments_descriptor;
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.Payments getDefaultInstanceForType() {
      return com.ixo.claims.v1beta1.Payments.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.Payments build() {
      com.ixo.claims.v1beta1.Payments result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.claims.v1beta1.Payments buildPartial() {
      com.ixo.claims.v1beta1.Payments result = new com.ixo.claims.v1beta1.Payments(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ixo.claims.v1beta1.Payments result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.submission_ = submissionBuilder_ == null
            ? submission_
            : submissionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.evaluation_ = evaluationBuilder_ == null
            ? evaluation_
            : evaluationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.approval_ = approvalBuilder_ == null
            ? approval_
            : approvalBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.rejection_ = rejectionBuilder_ == null
            ? rejection_
            : rejectionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.claims.v1beta1.Payments) {
        return mergeFrom((com.ixo.claims.v1beta1.Payments)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.claims.v1beta1.Payments other) {
      if (other == com.ixo.claims.v1beta1.Payments.getDefaultInstance()) return this;
      if (other.hasSubmission()) {
        mergeSubmission(other.getSubmission());
      }
      if (other.hasEvaluation()) {
        mergeEvaluation(other.getEvaluation());
      }
      if (other.hasApproval()) {
        mergeApproval(other.getApproval());
      }
      if (other.hasRejection()) {
        mergeRejection(other.getRejection());
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
                  getSubmissionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEvaluationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getApprovalFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getRejectionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.ixo.claims.v1beta1.Payment submission_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder> submissionBuilder_;
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     * @return Whether the submission field is set.
     */
    public boolean hasSubmission() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     * @return The submission.
     */
    public com.ixo.claims.v1beta1.Payment getSubmission() {
      if (submissionBuilder_ == null) {
        return submission_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : submission_;
      } else {
        return submissionBuilder_.getMessage();
      }
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     */
    public Builder setSubmission(com.ixo.claims.v1beta1.Payment value) {
      if (submissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        submission_ = value;
      } else {
        submissionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     */
    public Builder setSubmission(
        com.ixo.claims.v1beta1.Payment.Builder builderForValue) {
      if (submissionBuilder_ == null) {
        submission_ = builderForValue.build();
      } else {
        submissionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     */
    public Builder mergeSubmission(com.ixo.claims.v1beta1.Payment value) {
      if (submissionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          submission_ != null &&
          submission_ != com.ixo.claims.v1beta1.Payment.getDefaultInstance()) {
          getSubmissionBuilder().mergeFrom(value);
        } else {
          submission_ = value;
        }
      } else {
        submissionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     */
    public Builder clearSubmission() {
      bitField0_ = (bitField0_ & ~0x00000001);
      submission_ = null;
      if (submissionBuilder_ != null) {
        submissionBuilder_.dispose();
        submissionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     */
    public com.ixo.claims.v1beta1.Payment.Builder getSubmissionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSubmissionFieldBuilder().getBuilder();
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     */
    public com.ixo.claims.v1beta1.PaymentOrBuilder getSubmissionOrBuilder() {
      if (submissionBuilder_ != null) {
        return submissionBuilder_.getMessageOrBuilder();
      } else {
        return submission_ == null ?
            com.ixo.claims.v1beta1.Payment.getDefaultInstance() : submission_;
      }
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment submission = 1 [json_name = "submission"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder> 
        getSubmissionFieldBuilder() {
      if (submissionBuilder_ == null) {
        submissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder>(
                getSubmission(),
                getParentForChildren(),
                isClean());
        submission_ = null;
      }
      return submissionBuilder_;
    }

    private com.ixo.claims.v1beta1.Payment evaluation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder> evaluationBuilder_;
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     * @return Whether the evaluation field is set.
     */
    public boolean hasEvaluation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     * @return The evaluation.
     */
    public com.ixo.claims.v1beta1.Payment getEvaluation() {
      if (evaluationBuilder_ == null) {
        return evaluation_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : evaluation_;
      } else {
        return evaluationBuilder_.getMessage();
      }
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     */
    public Builder setEvaluation(com.ixo.claims.v1beta1.Payment value) {
      if (evaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evaluation_ = value;
      } else {
        evaluationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     */
    public Builder setEvaluation(
        com.ixo.claims.v1beta1.Payment.Builder builderForValue) {
      if (evaluationBuilder_ == null) {
        evaluation_ = builderForValue.build();
      } else {
        evaluationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     */
    public Builder mergeEvaluation(com.ixo.claims.v1beta1.Payment value) {
      if (evaluationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          evaluation_ != null &&
          evaluation_ != com.ixo.claims.v1beta1.Payment.getDefaultInstance()) {
          getEvaluationBuilder().mergeFrom(value);
        } else {
          evaluation_ = value;
        }
      } else {
        evaluationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     */
    public Builder clearEvaluation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      evaluation_ = null;
      if (evaluationBuilder_ != null) {
        evaluationBuilder_.dispose();
        evaluationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     */
    public com.ixo.claims.v1beta1.Payment.Builder getEvaluationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEvaluationFieldBuilder().getBuilder();
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     */
    public com.ixo.claims.v1beta1.PaymentOrBuilder getEvaluationOrBuilder() {
      if (evaluationBuilder_ != null) {
        return evaluationBuilder_.getMessageOrBuilder();
      } else {
        return evaluation_ == null ?
            com.ixo.claims.v1beta1.Payment.getDefaultInstance() : evaluation_;
      }
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment evaluation = 2 [json_name = "evaluation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder> 
        getEvaluationFieldBuilder() {
      if (evaluationBuilder_ == null) {
        evaluationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder>(
                getEvaluation(),
                getParentForChildren(),
                isClean());
        evaluation_ = null;
      }
      return evaluationBuilder_;
    }

    private com.ixo.claims.v1beta1.Payment approval_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder> approvalBuilder_;
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     * @return Whether the approval field is set.
     */
    public boolean hasApproval() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     * @return The approval.
     */
    public com.ixo.claims.v1beta1.Payment getApproval() {
      if (approvalBuilder_ == null) {
        return approval_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : approval_;
      } else {
        return approvalBuilder_.getMessage();
      }
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     */
    public Builder setApproval(com.ixo.claims.v1beta1.Payment value) {
      if (approvalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        approval_ = value;
      } else {
        approvalBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     */
    public Builder setApproval(
        com.ixo.claims.v1beta1.Payment.Builder builderForValue) {
      if (approvalBuilder_ == null) {
        approval_ = builderForValue.build();
      } else {
        approvalBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     */
    public Builder mergeApproval(com.ixo.claims.v1beta1.Payment value) {
      if (approvalBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          approval_ != null &&
          approval_ != com.ixo.claims.v1beta1.Payment.getDefaultInstance()) {
          getApprovalBuilder().mergeFrom(value);
        } else {
          approval_ = value;
        }
      } else {
        approvalBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     */
    public Builder clearApproval() {
      bitField0_ = (bitField0_ & ~0x00000004);
      approval_ = null;
      if (approvalBuilder_ != null) {
        approvalBuilder_.dispose();
        approvalBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     */
    public com.ixo.claims.v1beta1.Payment.Builder getApprovalBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getApprovalFieldBuilder().getBuilder();
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     */
    public com.ixo.claims.v1beta1.PaymentOrBuilder getApprovalOrBuilder() {
      if (approvalBuilder_ != null) {
        return approvalBuilder_.getMessageOrBuilder();
      } else {
        return approval_ == null ?
            com.ixo.claims.v1beta1.Payment.getDefaultInstance() : approval_;
      }
    }
    /**
     * <code>.ixo.claims.v1beta1.Payment approval = 3 [json_name = "approval"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder> 
        getApprovalFieldBuilder() {
      if (approvalBuilder_ == null) {
        approvalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder>(
                getApproval(),
                getParentForChildren(),
                isClean());
        approval_ = null;
      }
      return approvalBuilder_;
    }

    private com.ixo.claims.v1beta1.Payment rejection_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder> rejectionBuilder_;
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     * @return Whether the rejection field is set.
     */
    public boolean hasRejection() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     * @return The rejection.
     */
    public com.ixo.claims.v1beta1.Payment getRejection() {
      if (rejectionBuilder_ == null) {
        return rejection_ == null ? com.ixo.claims.v1beta1.Payment.getDefaultInstance() : rejection_;
      } else {
        return rejectionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     */
    public Builder setRejection(com.ixo.claims.v1beta1.Payment value) {
      if (rejectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rejection_ = value;
      } else {
        rejectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     */
    public Builder setRejection(
        com.ixo.claims.v1beta1.Payment.Builder builderForValue) {
      if (rejectionBuilder_ == null) {
        rejection_ = builderForValue.build();
      } else {
        rejectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     */
    public Builder mergeRejection(com.ixo.claims.v1beta1.Payment value) {
      if (rejectionBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          rejection_ != null &&
          rejection_ != com.ixo.claims.v1beta1.Payment.getDefaultInstance()) {
          getRejectionBuilder().mergeFrom(value);
        } else {
          rejection_ = value;
        }
      } else {
        rejectionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     */
    public Builder clearRejection() {
      bitField0_ = (bitField0_ & ~0x00000008);
      rejection_ = null;
      if (rejectionBuilder_ != null) {
        rejectionBuilder_.dispose();
        rejectionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     */
    public com.ixo.claims.v1beta1.Payment.Builder getRejectionBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getRejectionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     */
    public com.ixo.claims.v1beta1.PaymentOrBuilder getRejectionOrBuilder() {
      if (rejectionBuilder_ != null) {
        return rejectionBuilder_.getMessageOrBuilder();
      } else {
        return rejection_ == null ?
            com.ixo.claims.v1beta1.Payment.getDefaultInstance() : rejection_;
      }
    }
    /**
     * <pre>
     * Payment penalty = 5;
     * </pre>
     *
     * <code>.ixo.claims.v1beta1.Payment rejection = 4 [json_name = "rejection"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder> 
        getRejectionFieldBuilder() {
      if (rejectionBuilder_ == null) {
        rejectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ixo.claims.v1beta1.Payment, com.ixo.claims.v1beta1.Payment.Builder, com.ixo.claims.v1beta1.PaymentOrBuilder>(
                getRejection(),
                getParentForChildren(),
                isClean());
        rejection_ = null;
      }
      return rejectionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ixo.claims.v1beta1.Payments)
  }

  // @@protoc_insertion_point(class_scope:ixo.claims.v1beta1.Payments)
  private static final com.ixo.claims.v1beta1.Payments DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.claims.v1beta1.Payments();
  }

  public static com.ixo.claims.v1beta1.Payments getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Payments>
      PARSER = new com.google.protobuf.AbstractParser<Payments>() {
    @java.lang.Override
    public Payments parsePartialFrom(
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

  public static com.google.protobuf.Parser<Payments> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Payments> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.claims.v1beta1.Payments getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

