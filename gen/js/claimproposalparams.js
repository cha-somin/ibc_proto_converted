// source: shentu/shield/v1alpha1/genesis.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.shentu.shield.v1alpha1.ClaimProposalParams');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Duration');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.shentu.shield.v1alpha1.ClaimProposalParams.repeatedFields_, null);
};
goog.inherits(proto.shentu.shield.v1alpha1.ClaimProposalParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.shield.v1alpha1.ClaimProposalParams.displayName = 'proto.shentu.shield.v1alpha1.ClaimProposalParams';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.repeatedFields_ = [3];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.shield.v1alpha1.ClaimProposalParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.shield.v1alpha1.ClaimProposalParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    claimPeriod: (f = msg.getClaimPeriod()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    payoutPeriod: (f = msg.getPayoutPeriod()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    minDepositList: jspb.Message.toObjectList(msg.getMinDepositList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    depositRate: jspb.Message.getFieldWithDefault(msg, 4, ""),
    feesRate: jspb.Message.getFieldWithDefault(msg, 5, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.shield.v1alpha1.ClaimProposalParams;
  return proto.shentu.shield.v1alpha1.ClaimProposalParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.shield.v1alpha1.ClaimProposalParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setClaimPeriod(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setPayoutPeriod(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addMinDeposit(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDepositRate(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeesRate(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.shield.v1alpha1.ClaimProposalParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.shield.v1alpha1.ClaimProposalParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClaimPeriod();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getPayoutPeriod();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getMinDepositList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getDepositRate();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getFeesRate();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional google.protobuf.Duration claim_period = 1;
 * @return {?proto.google.protobuf.Duration}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.getClaimPeriod = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 1));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams} returns this
*/
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.setClaimPeriod = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams} returns this
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.clearClaimPeriod = function() {
  return this.setClaimPeriod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.hasClaimPeriod = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional google.protobuf.Duration payout_period = 2;
 * @return {?proto.google.protobuf.Duration}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.getPayoutPeriod = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 2));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams} returns this
*/
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.setPayoutPeriod = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams} returns this
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.clearPayoutPeriod = function() {
  return this.setPayoutPeriod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.hasPayoutPeriod = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated cosmos.base.v1beta1.Coin min_deposit = 3;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.getMinDepositList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams} returns this
*/
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.setMinDepositList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.addMinDeposit = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams} returns this
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.clearMinDepositList = function() {
  return this.setMinDepositList([]);
};


/**
 * optional string deposit_rate = 4;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.getDepositRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams} returns this
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.setDepositRate = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string fees_rate = 5;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.getFeesRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.ClaimProposalParams} returns this
 */
proto.shentu.shield.v1alpha1.ClaimProposalParams.prototype.setFeesRate = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


