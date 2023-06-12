// source: kyve/delegation/v1beta1/events.proto
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

goog.provide('proto.kyve.delegation.v1beta1.EventSlash');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.kyve.delegation.v1beta1.SlashType');
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
proto.kyve.delegation.v1beta1.EventSlash = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.delegation.v1beta1.EventSlash, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.delegation.v1beta1.EventSlash.displayName = 'proto.kyve.delegation.v1beta1.EventSlash';
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
proto.kyve.delegation.v1beta1.EventSlash.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.delegation.v1beta1.EventSlash.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.delegation.v1beta1.EventSlash} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.delegation.v1beta1.EventSlash.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    staker: jspb.Message.getFieldWithDefault(msg, 2, ""),
    amount: jspb.Message.getFieldWithDefault(msg, 3, 0),
    slashType: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.kyve.delegation.v1beta1.EventSlash}
 */
proto.kyve.delegation.v1beta1.EventSlash.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.delegation.v1beta1.EventSlash;
  return proto.kyve.delegation.v1beta1.EventSlash.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.delegation.v1beta1.EventSlash} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.delegation.v1beta1.EventSlash}
 */
proto.kyve.delegation.v1beta1.EventSlash.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setStaker(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAmount(value);
      break;
    case 4:
      var value = /** @type {!proto.kyve.delegation.v1beta1.SlashType} */ (reader.readEnum());
      msg.setSlashType(value);
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
proto.kyve.delegation.v1beta1.EventSlash.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.delegation.v1beta1.EventSlash.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.delegation.v1beta1.EventSlash} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.delegation.v1beta1.EventSlash.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getStaker();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAmount();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getSlashType();
  if (f !== 0.0) {
    writer.writeEnum(
      4,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.kyve.delegation.v1beta1.EventSlash.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.delegation.v1beta1.EventSlash} returns this
 */
proto.kyve.delegation.v1beta1.EventSlash.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string staker = 2;
 * @return {string}
 */
proto.kyve.delegation.v1beta1.EventSlash.prototype.getStaker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.delegation.v1beta1.EventSlash} returns this
 */
proto.kyve.delegation.v1beta1.EventSlash.prototype.setStaker = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 amount = 3;
 * @return {number}
 */
proto.kyve.delegation.v1beta1.EventSlash.prototype.getAmount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.delegation.v1beta1.EventSlash} returns this
 */
proto.kyve.delegation.v1beta1.EventSlash.prototype.setAmount = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional SlashType slash_type = 4;
 * @return {!proto.kyve.delegation.v1beta1.SlashType}
 */
proto.kyve.delegation.v1beta1.EventSlash.prototype.getSlashType = function() {
  return /** @type {!proto.kyve.delegation.v1beta1.SlashType} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.kyve.delegation.v1beta1.SlashType} value
 * @return {!proto.kyve.delegation.v1beta1.EventSlash} returns this
 */
proto.kyve.delegation.v1beta1.EventSlash.prototype.setSlashType = function(value) {
  return jspb.Message.setProto3EnumField(this, 4, value);
};


