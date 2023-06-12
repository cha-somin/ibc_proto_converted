// source: comdex/rewards/v1beta1/tx.proto
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

goog.provide('proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.displayName = 'proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers';
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
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.toObject = function(includeInstance, msg) {
  var f, obj = {
    appMappingId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    assetId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    totalRewards: (f = msg.getTotalRewards()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    durationDays: jspb.Message.getFieldWithDefault(msg, 4, 0),
    depositor: jspb.Message.getFieldWithDefault(msg, 5, ""),
    minLockupTimeSeconds: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers;
  return proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppMappingId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAssetId(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalRewards(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setDurationDays(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setDepositor(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setMinLockupTimeSeconds(value);
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
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAppMappingId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAssetId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getTotalRewards();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getDurationDays();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getDepositor();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getMinLockupTimeSeconds();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
};


/**
 * optional uint64 app_mapping_id = 1;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.getAppMappingId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} returns this
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.setAppMappingId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 asset_id = 2;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.getAssetId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} returns this
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.setAssetId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional cosmos.base.v1beta1.Coin total_rewards = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.getTotalRewards = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} returns this
*/
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.setTotalRewards = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} returns this
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.clearTotalRewards = function() {
  return this.setTotalRewards(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.hasTotalRewards = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional int64 duration_days = 4;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.getDurationDays = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} returns this
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.setDurationDays = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string depositor = 5;
 * @return {string}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.getDepositor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} returns this
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.setDepositor = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional int64 min_lockup_time_seconds = 6;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.getMinLockupTimeSeconds = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers} returns this
 */
proto.comdex.rewards.v1beta1.ActivateExternalRewardsLockers.prototype.setMinLockupTimeSeconds = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


