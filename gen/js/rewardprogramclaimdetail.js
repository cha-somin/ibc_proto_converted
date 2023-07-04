// source: provenance/reward/v1/tx.proto
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

goog.provide('proto.provenance.reward.v1.RewardProgramClaimDetail');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.provenance.reward.v1.ClaimedRewardPeriodDetail');

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
proto.provenance.reward.v1.RewardProgramClaimDetail = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.reward.v1.RewardProgramClaimDetail.repeatedFields_, null);
};
goog.inherits(proto.provenance.reward.v1.RewardProgramClaimDetail, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.reward.v1.RewardProgramClaimDetail.displayName = 'proto.provenance.reward.v1.RewardProgramClaimDetail';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.repeatedFields_ = [3];



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
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.reward.v1.RewardProgramClaimDetail.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.reward.v1.RewardProgramClaimDetail} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.toObject = function(includeInstance, msg) {
  var f, obj = {
    rewardProgramId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    totalRewardClaim: (f = msg.getTotalRewardClaim()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    claimedRewardPeriodDetailsList: jspb.Message.toObjectList(msg.getClaimedRewardPeriodDetailsList(),
    proto.provenance.reward.v1.ClaimedRewardPeriodDetail.toObject, includeInstance)
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
 * @return {!proto.provenance.reward.v1.RewardProgramClaimDetail}
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.reward.v1.RewardProgramClaimDetail;
  return proto.provenance.reward.v1.RewardProgramClaimDetail.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.reward.v1.RewardProgramClaimDetail} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.reward.v1.RewardProgramClaimDetail}
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRewardProgramId(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalRewardClaim(value);
      break;
    case 3:
      var value = new proto.provenance.reward.v1.ClaimedRewardPeriodDetail;
      reader.readMessage(value,proto.provenance.reward.v1.ClaimedRewardPeriodDetail.deserializeBinaryFromReader);
      msg.addClaimedRewardPeriodDetails(value);
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
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.reward.v1.RewardProgramClaimDetail.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.reward.v1.RewardProgramClaimDetail} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRewardProgramId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getTotalRewardClaim();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getClaimedRewardPeriodDetailsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.provenance.reward.v1.ClaimedRewardPeriodDetail.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 reward_program_id = 1;
 * @return {number}
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.getRewardProgramId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.provenance.reward.v1.RewardProgramClaimDetail} returns this
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.setRewardProgramId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin total_reward_claim = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.getTotalRewardClaim = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.provenance.reward.v1.RewardProgramClaimDetail} returns this
*/
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.setTotalRewardClaim = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.reward.v1.RewardProgramClaimDetail} returns this
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.clearTotalRewardClaim = function() {
  return this.setTotalRewardClaim(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.hasTotalRewardClaim = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated ClaimedRewardPeriodDetail claimed_reward_period_details = 3;
 * @return {!Array<!proto.provenance.reward.v1.ClaimedRewardPeriodDetail>}
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.getClaimedRewardPeriodDetailsList = function() {
  return /** @type{!Array<!proto.provenance.reward.v1.ClaimedRewardPeriodDetail>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.reward.v1.ClaimedRewardPeriodDetail, 3));
};


/**
 * @param {!Array<!proto.provenance.reward.v1.ClaimedRewardPeriodDetail>} value
 * @return {!proto.provenance.reward.v1.RewardProgramClaimDetail} returns this
*/
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.setClaimedRewardPeriodDetailsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.provenance.reward.v1.ClaimedRewardPeriodDetail=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.reward.v1.ClaimedRewardPeriodDetail}
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.addClaimedRewardPeriodDetails = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.provenance.reward.v1.ClaimedRewardPeriodDetail, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.reward.v1.RewardProgramClaimDetail} returns this
 */
proto.provenance.reward.v1.RewardProgramClaimDetail.prototype.clearClaimedRewardPeriodDetailsList = function() {
  return this.setClaimedRewardPeriodDetailsList([]);
};

