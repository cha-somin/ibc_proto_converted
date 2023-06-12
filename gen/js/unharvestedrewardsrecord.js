// source: crescent/farming/v1beta1/genesis.proto
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

goog.provide('proto.crescent.farming.v1beta1.UnharvestedRewardsRecord');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.crescent.farming.v1beta1.UnharvestedRewards');

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
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.farming.v1beta1.UnharvestedRewardsRecord, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.displayName = 'proto.crescent.farming.v1beta1.UnharvestedRewardsRecord';
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
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.toObject = function(includeInstance, msg) {
  var f, obj = {
    farmer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    stakingCoinDenom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    unharvestedRewards: (f = msg.getUnharvestedRewards()) && proto.crescent.farming.v1beta1.UnharvestedRewards.toObject(includeInstance, f)
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
 * @return {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord}
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.farming.v1beta1.UnharvestedRewardsRecord;
  return proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord}
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFarmer(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setStakingCoinDenom(value);
      break;
    case 3:
      var value = new proto.crescent.farming.v1beta1.UnharvestedRewards;
      reader.readMessage(value,proto.crescent.farming.v1beta1.UnharvestedRewards.deserializeBinaryFromReader);
      msg.setUnharvestedRewards(value);
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
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFarmer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getStakingCoinDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getUnharvestedRewards();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.crescent.farming.v1beta1.UnharvestedRewards.serializeBinaryToWriter
    );
  }
};


/**
 * optional string farmer = 1;
 * @return {string}
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.getFarmer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord} returns this
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.setFarmer = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string staking_coin_denom = 2;
 * @return {string}
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.getStakingCoinDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord} returns this
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.setStakingCoinDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional UnharvestedRewards unharvested_rewards = 3;
 * @return {?proto.crescent.farming.v1beta1.UnharvestedRewards}
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.getUnharvestedRewards = function() {
  return /** @type{?proto.crescent.farming.v1beta1.UnharvestedRewards} */ (
    jspb.Message.getWrapperField(this, proto.crescent.farming.v1beta1.UnharvestedRewards, 3));
};


/**
 * @param {?proto.crescent.farming.v1beta1.UnharvestedRewards|undefined} value
 * @return {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord} returns this
*/
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.setUnharvestedRewards = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.farming.v1beta1.UnharvestedRewardsRecord} returns this
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.clearUnharvestedRewards = function() {
  return this.setUnharvestedRewards(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.farming.v1beta1.UnharvestedRewardsRecord.prototype.hasUnharvestedRewards = function() {
  return jspb.Message.getField(this, 3) != null;
};


