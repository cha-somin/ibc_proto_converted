// source: crescent/liquidstaking/v1beta1/liquidstaking.proto
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

goog.provide('proto.crescent.liquidstaking.v1beta1.WhitelistedValidator');

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
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.liquidstaking.v1beta1.WhitelistedValidator, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.displayName = 'proto.crescent.liquidstaking.v1beta1.WhitelistedValidator';
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
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.liquidstaking.v1beta1.WhitelistedValidator} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.toObject = function(includeInstance, msg) {
  var f, obj = {
    validatorAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    targetWeight: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.crescent.liquidstaking.v1beta1.WhitelistedValidator}
 */
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.liquidstaking.v1beta1.WhitelistedValidator;
  return proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.liquidstaking.v1beta1.WhitelistedValidator} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.liquidstaking.v1beta1.WhitelistedValidator}
 */
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidatorAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTargetWeight(value);
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
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.liquidstaking.v1beta1.WhitelistedValidator} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getValidatorAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTargetWeight();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string validator_address = 1;
 * @return {string}
 */
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.prototype.getValidatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.liquidstaking.v1beta1.WhitelistedValidator} returns this
 */
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.prototype.setValidatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string target_weight = 2;
 * @return {string}
 */
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.prototype.getTargetWeight = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.liquidstaking.v1beta1.WhitelistedValidator} returns this
 */
proto.crescent.liquidstaking.v1beta1.WhitelistedValidator.prototype.setTargetWeight = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


