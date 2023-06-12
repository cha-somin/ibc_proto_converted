// source: axelar/tss/exported/v1beta1/types.proto
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

goog.provide('proto.axelar.tss.exported.v1beta1.KeyRequirement');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.utils.v1beta1.Threshold');

goog.forwardDeclare('proto.axelar.tss.exported.v1beta1.KeyRole');
goog.forwardDeclare('proto.axelar.tss.exported.v1beta1.KeyShareDistributionPolicy');
goog.forwardDeclare('proto.axelar.tss.exported.v1beta1.KeyType');
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
proto.axelar.tss.exported.v1beta1.KeyRequirement = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.tss.exported.v1beta1.KeyRequirement, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.tss.exported.v1beta1.KeyRequirement.displayName = 'proto.axelar.tss.exported.v1beta1.KeyRequirement';
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
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.tss.exported.v1beta1.KeyRequirement.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.tss.exported.v1beta1.KeyRequirement} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.toObject = function(includeInstance, msg) {
  var f, obj = {
    keyRole: jspb.Message.getFieldWithDefault(msg, 1, 0),
    keyType: jspb.Message.getFieldWithDefault(msg, 2, 0),
    minKeygenThreshold: (f = msg.getMinKeygenThreshold()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    safetyThreshold: (f = msg.getSafetyThreshold()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    keyShareDistributionPolicy: jspb.Message.getFieldWithDefault(msg, 5, 0),
    maxTotalShareCount: jspb.Message.getFieldWithDefault(msg, 6, 0),
    minTotalShareCount: jspb.Message.getFieldWithDefault(msg, 7, 0),
    keygenVotingThreshold: (f = msg.getKeygenVotingThreshold()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    signVotingThreshold: (f = msg.getSignVotingThreshold()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    keygenTimeout: jspb.Message.getFieldWithDefault(msg, 10, 0),
    signTimeout: jspb.Message.getFieldWithDefault(msg, 11, 0)
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
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.tss.exported.v1beta1.KeyRequirement;
  return proto.axelar.tss.exported.v1beta1.KeyRequirement.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.tss.exported.v1beta1.KeyRequirement} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.axelar.tss.exported.v1beta1.KeyRole} */ (reader.readEnum());
      msg.setKeyRole(value);
      break;
    case 2:
      var value = /** @type {!proto.axelar.tss.exported.v1beta1.KeyType} */ (reader.readEnum());
      msg.setKeyType(value);
      break;
    case 3:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setMinKeygenThreshold(value);
      break;
    case 4:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setSafetyThreshold(value);
      break;
    case 5:
      var value = /** @type {!proto.axelar.tss.exported.v1beta1.KeyShareDistributionPolicy} */ (reader.readEnum());
      msg.setKeyShareDistributionPolicy(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setMaxTotalShareCount(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setMinTotalShareCount(value);
      break;
    case 8:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setKeygenVotingThreshold(value);
      break;
    case 9:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setSignVotingThreshold(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setKeygenTimeout(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setSignTimeout(value);
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
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.tss.exported.v1beta1.KeyRequirement.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.tss.exported.v1beta1.KeyRequirement} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getKeyRole();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getKeyType();
  if (f !== 0.0) {
    writer.writeEnum(
      2,
      f
    );
  }
  f = message.getMinKeygenThreshold();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getSafetyThreshold();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getKeyShareDistributionPolicy();
  if (f !== 0.0) {
    writer.writeEnum(
      5,
      f
    );
  }
  f = message.getMaxTotalShareCount();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
  f = message.getMinTotalShareCount();
  if (f !== 0) {
    writer.writeInt64(
      7,
      f
    );
  }
  f = message.getKeygenVotingThreshold();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getSignVotingThreshold();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getKeygenTimeout();
  if (f !== 0) {
    writer.writeInt64(
      10,
      f
    );
  }
  f = message.getSignTimeout();
  if (f !== 0) {
    writer.writeInt64(
      11,
      f
    );
  }
};


/**
 * optional KeyRole key_role = 1;
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRole}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getKeyRole = function() {
  return /** @type {!proto.axelar.tss.exported.v1beta1.KeyRole} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.axelar.tss.exported.v1beta1.KeyRole} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setKeyRole = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional KeyType key_type = 2;
 * @return {!proto.axelar.tss.exported.v1beta1.KeyType}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getKeyType = function() {
  return /** @type {!proto.axelar.tss.exported.v1beta1.KeyType} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {!proto.axelar.tss.exported.v1beta1.KeyType} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setKeyType = function(value) {
  return jspb.Message.setProto3EnumField(this, 2, value);
};


/**
 * optional axelar.utils.v1beta1.Threshold min_keygen_threshold = 3;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getMinKeygenThreshold = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 3));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
*/
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setMinKeygenThreshold = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.clearMinKeygenThreshold = function() {
  return this.setMinKeygenThreshold(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.hasMinKeygenThreshold = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional axelar.utils.v1beta1.Threshold safety_threshold = 4;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getSafetyThreshold = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 4));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
*/
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setSafetyThreshold = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.clearSafetyThreshold = function() {
  return this.setSafetyThreshold(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.hasSafetyThreshold = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional KeyShareDistributionPolicy key_share_distribution_policy = 5;
 * @return {!proto.axelar.tss.exported.v1beta1.KeyShareDistributionPolicy}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getKeyShareDistributionPolicy = function() {
  return /** @type {!proto.axelar.tss.exported.v1beta1.KeyShareDistributionPolicy} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {!proto.axelar.tss.exported.v1beta1.KeyShareDistributionPolicy} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setKeyShareDistributionPolicy = function(value) {
  return jspb.Message.setProto3EnumField(this, 5, value);
};


/**
 * optional int64 max_total_share_count = 6;
 * @return {number}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getMaxTotalShareCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setMaxTotalShareCount = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional int64 min_total_share_count = 7;
 * @return {number}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getMinTotalShareCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setMinTotalShareCount = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional axelar.utils.v1beta1.Threshold keygen_voting_threshold = 8;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getKeygenVotingThreshold = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 8));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
*/
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setKeygenVotingThreshold = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.clearKeygenVotingThreshold = function() {
  return this.setKeygenVotingThreshold(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.hasKeygenVotingThreshold = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional axelar.utils.v1beta1.Threshold sign_voting_threshold = 9;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getSignVotingThreshold = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 9));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
*/
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setSignVotingThreshold = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.clearSignVotingThreshold = function() {
  return this.setSignVotingThreshold(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.hasSignVotingThreshold = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional int64 keygen_timeout = 10;
 * @return {number}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getKeygenTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setKeygenTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional int64 sign_timeout = 11;
 * @return {number}
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.getSignTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement} returns this
 */
proto.axelar.tss.exported.v1beta1.KeyRequirement.prototype.setSignTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 11, value);
};


