// source: quicksilver/tokenfactory/v1beta1/tx.proto
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

goog.provide('proto.quicksilver.tokenfactory.v1beta1.MsgBurn');

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
proto.quicksilver.tokenfactory.v1beta1.MsgBurn = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.quicksilver.tokenfactory.v1beta1.MsgBurn, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.tokenfactory.v1beta1.MsgBurn.displayName = 'proto.quicksilver.tokenfactory.v1beta1.MsgBurn';
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
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.tokenfactory.v1beta1.MsgBurn.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.tokenfactory.v1beta1.MsgBurn} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.quicksilver.tokenfactory.v1beta1.MsgBurn}
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.tokenfactory.v1beta1.MsgBurn;
  return proto.quicksilver.tokenfactory.v1beta1.MsgBurn.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.tokenfactory.v1beta1.MsgBurn} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.tokenfactory.v1beta1.MsgBurn}
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
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
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.tokenfactory.v1beta1.MsgBurn.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.tokenfactory.v1beta1.MsgBurn} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.tokenfactory.v1beta1.MsgBurn} returns this
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.quicksilver.tokenfactory.v1beta1.MsgBurn} returns this
*/
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.tokenfactory.v1beta1.MsgBurn} returns this
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.tokenfactory.v1beta1.MsgBurn.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 2) != null;
};


