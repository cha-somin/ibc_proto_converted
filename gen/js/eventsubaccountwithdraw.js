// source: injective/exchange/v1beta1/events.proto
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

goog.provide('proto.injective.exchange.v1beta1.EventSubaccountWithdraw');

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
proto.injective.exchange.v1beta1.EventSubaccountWithdraw = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.EventSubaccountWithdraw, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.EventSubaccountWithdraw.displayName = 'proto.injective.exchange.v1beta1.EventSubaccountWithdraw';
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
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.EventSubaccountWithdraw.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.toObject = function(includeInstance, msg) {
  var f, obj = {
    subaccountId: msg.getSubaccountId_asB64(),
    dstAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
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
 * @return {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw}
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.EventSubaccountWithdraw;
  return proto.injective.exchange.v1beta1.EventSubaccountWithdraw.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw}
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSubaccountId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDstAddress(value);
      break;
    case 3:
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
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.EventSubaccountWithdraw.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubaccountId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getDstAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes subaccount_id = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.getSubaccountId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes subaccount_id = 1;
 * This is a type-conversion wrapper around `getSubaccountId()`
 * @return {string}
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.getSubaccountId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSubaccountId()));
};


/**
 * optional bytes subaccount_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSubaccountId()`
 * @return {!Uint8Array}
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.getSubaccountId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSubaccountId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw} returns this
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.setSubaccountId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional string dst_address = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.getDstAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw} returns this
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.setDstAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw} returns this
*/
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.EventSubaccountWithdraw} returns this
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.EventSubaccountWithdraw.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 3) != null;
};


