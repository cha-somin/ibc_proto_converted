// source: provenance/reward/v1/query.proto
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

goog.provide('proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.displayName = 'proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest';
}



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
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    rewardId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    claimPeriodId: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest}
 */
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest;
  return proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest}
 */
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRewardId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setClaimPeriodId(value);
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
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRewardId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getClaimPeriodId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
};


/**
 * optional uint64 reward_id = 1;
 * @return {number}
 */
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.prototype.getRewardId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest} returns this
 */
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.prototype.setRewardId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 claim_period_id = 2;
 * @return {number}
 */
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.prototype.getClaimPeriodId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest} returns this
 */
proto.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.prototype.setClaimPeriodId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


