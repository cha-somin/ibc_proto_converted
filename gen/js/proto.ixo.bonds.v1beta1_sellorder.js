// source: ixo/bonds/v1beta1/bonds.proto
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

goog.provide('proto.ixo.bonds.v1beta1.SellOrder');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.bonds.v1beta1.BaseOrder');

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
proto.ixo.bonds.v1beta1.SellOrder = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ixo.bonds.v1beta1.SellOrder, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.bonds.v1beta1.SellOrder.displayName = 'proto.ixo.bonds.v1beta1.SellOrder';
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
proto.ixo.bonds.v1beta1.SellOrder.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.bonds.v1beta1.SellOrder.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.bonds.v1beta1.SellOrder} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.bonds.v1beta1.SellOrder.toObject = function(includeInstance, msg) {
  var f, obj = {
    baseOrder: (f = msg.getBaseOrder()) && proto.ixo.bonds.v1beta1.BaseOrder.toObject(includeInstance, f)
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
 * @return {!proto.ixo.bonds.v1beta1.SellOrder}
 */
proto.ixo.bonds.v1beta1.SellOrder.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.bonds.v1beta1.SellOrder;
  return proto.ixo.bonds.v1beta1.SellOrder.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.bonds.v1beta1.SellOrder} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.bonds.v1beta1.SellOrder}
 */
proto.ixo.bonds.v1beta1.SellOrder.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ixo.bonds.v1beta1.BaseOrder;
      reader.readMessage(value,proto.ixo.bonds.v1beta1.BaseOrder.deserializeBinaryFromReader);
      msg.setBaseOrder(value);
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
proto.ixo.bonds.v1beta1.SellOrder.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.bonds.v1beta1.SellOrder.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.bonds.v1beta1.SellOrder} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.bonds.v1beta1.SellOrder.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBaseOrder();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.ixo.bonds.v1beta1.BaseOrder.serializeBinaryToWriter
    );
  }
};


/**
 * optional BaseOrder base_order = 1;
 * @return {?proto.ixo.bonds.v1beta1.BaseOrder}
 */
proto.ixo.bonds.v1beta1.SellOrder.prototype.getBaseOrder = function() {
  return /** @type{?proto.ixo.bonds.v1beta1.BaseOrder} */ (
    jspb.Message.getWrapperField(this, proto.ixo.bonds.v1beta1.BaseOrder, 1));
};


/**
 * @param {?proto.ixo.bonds.v1beta1.BaseOrder|undefined} value
 * @return {!proto.ixo.bonds.v1beta1.SellOrder} returns this
*/
proto.ixo.bonds.v1beta1.SellOrder.prototype.setBaseOrder = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.bonds.v1beta1.SellOrder} returns this
 */
proto.ixo.bonds.v1beta1.SellOrder.prototype.clearBaseOrder = function() {
  return this.setBaseOrder(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.bonds.v1beta1.SellOrder.prototype.hasBaseOrder = function() {
  return jspb.Message.getField(this, 1) != null;
};


