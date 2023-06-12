// source: injective/exchange/v1beta1/exchange.proto
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

goog.provide('proto.injective.exchange.v1beta1.DerivativeLimitOrder');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.OrderInfo');

goog.forwardDeclare('proto.injective.exchange.v1beta1.OrderType');
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
proto.injective.exchange.v1beta1.DerivativeLimitOrder = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.DerivativeLimitOrder, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.DerivativeLimitOrder.displayName = 'proto.injective.exchange.v1beta1.DerivativeLimitOrder';
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
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.DerivativeLimitOrder.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.toObject = function(includeInstance, msg) {
  var f, obj = {
    orderInfo: (f = msg.getOrderInfo()) && proto.injective.exchange.v1beta1.OrderInfo.toObject(includeInstance, f),
    orderType: jspb.Message.getFieldWithDefault(msg, 2, 0),
    margin: jspb.Message.getFieldWithDefault(msg, 3, ""),
    fillable: jspb.Message.getFieldWithDefault(msg, 4, ""),
    triggerPrice: jspb.Message.getFieldWithDefault(msg, 5, ""),
    orderHash: msg.getOrderHash_asB64()
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
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.DerivativeLimitOrder;
  return proto.injective.exchange.v1beta1.DerivativeLimitOrder.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.exchange.v1beta1.OrderInfo;
      reader.readMessage(value,proto.injective.exchange.v1beta1.OrderInfo.deserializeBinaryFromReader);
      msg.setOrderInfo(value);
      break;
    case 2:
      var value = /** @type {!proto.injective.exchange.v1beta1.OrderType} */ (reader.readEnum());
      msg.setOrderType(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMargin(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setFillable(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTriggerPrice(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setOrderHash(value);
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
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.DerivativeLimitOrder.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrderInfo();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.injective.exchange.v1beta1.OrderInfo.serializeBinaryToWriter
    );
  }
  f = message.getOrderType();
  if (f !== 0.0) {
    writer.writeEnum(
      2,
      f
    );
  }
  f = message.getMargin();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getFillable();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getTriggerPrice();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getOrderHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
};


/**
 * optional OrderInfo order_info = 1;
 * @return {?proto.injective.exchange.v1beta1.OrderInfo}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.getOrderInfo = function() {
  return /** @type{?proto.injective.exchange.v1beta1.OrderInfo} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.OrderInfo, 1));
};


/**
 * @param {?proto.injective.exchange.v1beta1.OrderInfo|undefined} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} returns this
*/
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.setOrderInfo = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} returns this
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.clearOrderInfo = function() {
  return this.setOrderInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.hasOrderInfo = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional OrderType order_type = 2;
 * @return {!proto.injective.exchange.v1beta1.OrderType}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.getOrderType = function() {
  return /** @type {!proto.injective.exchange.v1beta1.OrderType} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {!proto.injective.exchange.v1beta1.OrderType} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} returns this
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.setOrderType = function(value) {
  return jspb.Message.setProto3EnumField(this, 2, value);
};


/**
 * optional string margin = 3;
 * @return {string}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.getMargin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} returns this
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.setMargin = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string fillable = 4;
 * @return {string}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.getFillable = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} returns this
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.setFillable = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string trigger_price = 5;
 * @return {string}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.getTriggerPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} returns this
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.setTriggerPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional bytes order_hash = 6;
 * @return {string}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.getOrderHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes order_hash = 6;
 * This is a type-conversion wrapper around `getOrderHash()`
 * @return {string}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.getOrderHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getOrderHash()));
};


/**
 * optional bytes order_hash = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getOrderHash()`
 * @return {!Uint8Array}
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.getOrderHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getOrderHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder} returns this
 */
proto.injective.exchange.v1beta1.DerivativeLimitOrder.prototype.setOrderHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


