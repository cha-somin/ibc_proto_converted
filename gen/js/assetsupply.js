// source: kava/issuance/v1beta1/genesis.proto
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

goog.provide('proto.kava.issuance.v1beta1.AssetSupply');

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
proto.kava.issuance.v1beta1.AssetSupply = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.issuance.v1beta1.AssetSupply, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.issuance.v1beta1.AssetSupply.displayName = 'proto.kava.issuance.v1beta1.AssetSupply';
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
proto.kava.issuance.v1beta1.AssetSupply.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.issuance.v1beta1.AssetSupply.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.issuance.v1beta1.AssetSupply} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.issuance.v1beta1.AssetSupply.toObject = function(includeInstance, msg) {
  var f, obj = {
    currentSupply: (f = msg.getCurrentSupply()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    timeElapsed: (f = msg.getTimeElapsed()) && proto.google.protobuf.Duration.toObject(includeInstance, f)
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
 * @return {!proto.kava.issuance.v1beta1.AssetSupply}
 */
proto.kava.issuance.v1beta1.AssetSupply.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.issuance.v1beta1.AssetSupply;
  return proto.kava.issuance.v1beta1.AssetSupply.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.issuance.v1beta1.AssetSupply} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.issuance.v1beta1.AssetSupply}
 */
proto.kava.issuance.v1beta1.AssetSupply.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setCurrentSupply(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setTimeElapsed(value);
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
proto.kava.issuance.v1beta1.AssetSupply.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.issuance.v1beta1.AssetSupply.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.issuance.v1beta1.AssetSupply} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.issuance.v1beta1.AssetSupply.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCurrentSupply();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTimeElapsed();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.base.v1beta1.Coin current_supply = 1;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.issuance.v1beta1.AssetSupply.prototype.getCurrentSupply = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.issuance.v1beta1.AssetSupply} returns this
*/
proto.kava.issuance.v1beta1.AssetSupply.prototype.setCurrentSupply = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.issuance.v1beta1.AssetSupply} returns this
 */
proto.kava.issuance.v1beta1.AssetSupply.prototype.clearCurrentSupply = function() {
  return this.setCurrentSupply(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.issuance.v1beta1.AssetSupply.prototype.hasCurrentSupply = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional google.protobuf.Duration time_elapsed = 2;
 * @return {?proto.google.protobuf.Duration}
 */
proto.kava.issuance.v1beta1.AssetSupply.prototype.getTimeElapsed = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 2));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.kava.issuance.v1beta1.AssetSupply} returns this
*/
proto.kava.issuance.v1beta1.AssetSupply.prototype.setTimeElapsed = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.issuance.v1beta1.AssetSupply} returns this
 */
proto.kava.issuance.v1beta1.AssetSupply.prototype.clearTimeElapsed = function() {
  return this.setTimeElapsed(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.issuance.v1beta1.AssetSupply.prototype.hasTimeElapsed = function() {
  return jspb.Message.getField(this, 2) != null;
};

