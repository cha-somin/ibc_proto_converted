// source: injective/exchange/v1beta1/tx.proto
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

goog.provide('proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.DerivativeOrder');

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
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.displayName = 'proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.repeatedFields_ = [2];



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
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    ordersList: jspb.Message.toObjectList(msg.getOrdersList(),
    proto.injective.exchange.v1beta1.DerivativeOrder.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders}
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders;
  return proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders}
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.injective.exchange.v1beta1.DerivativeOrder;
      reader.readMessage(value,proto.injective.exchange.v1beta1.DerivativeOrder.deserializeBinaryFromReader);
      msg.addOrders(value);
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
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOrdersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.injective.exchange.v1beta1.DerivativeOrder.serializeBinaryToWriter
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders} returns this
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated DerivativeOrder orders = 2;
 * @return {!Array<!proto.injective.exchange.v1beta1.DerivativeOrder>}
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.prototype.getOrdersList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.DerivativeOrder>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.DerivativeOrder, 2));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.DerivativeOrder>} value
 * @return {!proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders} returns this
*/
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.prototype.setOrdersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.DerivativeOrder=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.DerivativeOrder}
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.prototype.addOrders = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.injective.exchange.v1beta1.DerivativeOrder, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders} returns this
 */
proto.injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders.prototype.clearOrdersList = function() {
  return this.setOrdersList([]);
};


