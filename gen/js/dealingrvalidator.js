// source: stafihub/rvalidator/genesis.proto
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

goog.provide('proto.stafihub.stafihub.rvalidator.DealingRValidator');

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
proto.stafihub.stafihub.rvalidator.DealingRValidator = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.rvalidator.DealingRValidator, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.rvalidator.DealingRValidator.displayName = 'proto.stafihub.stafihub.rvalidator.DealingRValidator';
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
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.rvalidator.DealingRValidator.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.rvalidator.DealingRValidator} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    pooladdress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    oldvaladdress: jspb.Message.getFieldWithDefault(msg, 3, ""),
    newvaladdress: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.stafihub.stafihub.rvalidator.DealingRValidator}
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.rvalidator.DealingRValidator;
  return proto.stafihub.stafihub.rvalidator.DealingRValidator.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.rvalidator.DealingRValidator} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.rvalidator.DealingRValidator}
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPooladdress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setOldvaladdress(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setNewvaladdress(value);
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
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.rvalidator.DealingRValidator.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.rvalidator.DealingRValidator} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPooladdress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOldvaladdress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getNewvaladdress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rvalidator.DealingRValidator} returns this
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string poolAddress = 2;
 * @return {string}
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.getPooladdress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rvalidator.DealingRValidator} returns this
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.setPooladdress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string oldValAddress = 3;
 * @return {string}
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.getOldvaladdress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rvalidator.DealingRValidator} returns this
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.setOldvaladdress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string newValAddress = 4;
 * @return {string}
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.getNewvaladdress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rvalidator.DealingRValidator} returns this
 */
proto.stafihub.stafihub.rvalidator.DealingRValidator.prototype.setNewvaladdress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


