// source: irismod/htlc/htlc.proto
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

goog.provide('proto.irismod.htlc.AssetSupply');

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
proto.irismod.htlc.AssetSupply = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.htlc.AssetSupply, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.htlc.AssetSupply.displayName = 'proto.irismod.htlc.AssetSupply';
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
proto.irismod.htlc.AssetSupply.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.htlc.AssetSupply.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.htlc.AssetSupply} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.htlc.AssetSupply.toObject = function(includeInstance, msg) {
  var f, obj = {
    incomingSupply: (f = msg.getIncomingSupply()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    outgoingSupply: (f = msg.getOutgoingSupply()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    currentSupply: (f = msg.getCurrentSupply()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    timeLimitedCurrentSupply: (f = msg.getTimeLimitedCurrentSupply()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
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
 * @return {!proto.irismod.htlc.AssetSupply}
 */
proto.irismod.htlc.AssetSupply.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.htlc.AssetSupply;
  return proto.irismod.htlc.AssetSupply.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.htlc.AssetSupply} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.htlc.AssetSupply}
 */
proto.irismod.htlc.AssetSupply.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setIncomingSupply(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setOutgoingSupply(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setCurrentSupply(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTimeLimitedCurrentSupply(value);
      break;
    case 5:
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
proto.irismod.htlc.AssetSupply.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.htlc.AssetSupply.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.htlc.AssetSupply} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.htlc.AssetSupply.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIncomingSupply();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getOutgoingSupply();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getCurrentSupply();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTimeLimitedCurrentSupply();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTimeElapsed();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.base.v1beta1.Coin incoming_supply = 1;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.htlc.AssetSupply.prototype.getIncomingSupply = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.irismod.htlc.AssetSupply} returns this
*/
proto.irismod.htlc.AssetSupply.prototype.setIncomingSupply = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.htlc.AssetSupply} returns this
 */
proto.irismod.htlc.AssetSupply.prototype.clearIncomingSupply = function() {
  return this.setIncomingSupply(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.htlc.AssetSupply.prototype.hasIncomingSupply = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin outgoing_supply = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.htlc.AssetSupply.prototype.getOutgoingSupply = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.irismod.htlc.AssetSupply} returns this
*/
proto.irismod.htlc.AssetSupply.prototype.setOutgoingSupply = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.htlc.AssetSupply} returns this
 */
proto.irismod.htlc.AssetSupply.prototype.clearOutgoingSupply = function() {
  return this.setOutgoingSupply(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.htlc.AssetSupply.prototype.hasOutgoingSupply = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin current_supply = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.htlc.AssetSupply.prototype.getCurrentSupply = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.irismod.htlc.AssetSupply} returns this
*/
proto.irismod.htlc.AssetSupply.prototype.setCurrentSupply = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.htlc.AssetSupply} returns this
 */
proto.irismod.htlc.AssetSupply.prototype.clearCurrentSupply = function() {
  return this.setCurrentSupply(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.htlc.AssetSupply.prototype.hasCurrentSupply = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin time_limited_current_supply = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.htlc.AssetSupply.prototype.getTimeLimitedCurrentSupply = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.irismod.htlc.AssetSupply} returns this
*/
proto.irismod.htlc.AssetSupply.prototype.setTimeLimitedCurrentSupply = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.htlc.AssetSupply} returns this
 */
proto.irismod.htlc.AssetSupply.prototype.clearTimeLimitedCurrentSupply = function() {
  return this.setTimeLimitedCurrentSupply(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.htlc.AssetSupply.prototype.hasTimeLimitedCurrentSupply = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.Duration time_elapsed = 5;
 * @return {?proto.google.protobuf.Duration}
 */
proto.irismod.htlc.AssetSupply.prototype.getTimeElapsed = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 5));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.irismod.htlc.AssetSupply} returns this
*/
proto.irismod.htlc.AssetSupply.prototype.setTimeElapsed = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.htlc.AssetSupply} returns this
 */
proto.irismod.htlc.AssetSupply.prototype.clearTimeElapsed = function() {
  return this.setTimeElapsed(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.htlc.AssetSupply.prototype.hasTimeElapsed = function() {
  return jspb.Message.getField(this, 5) != null;
};


