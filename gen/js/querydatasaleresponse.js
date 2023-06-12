// source: panacea/datadeal/v2alpha2/query.proto
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

goog.provide('proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.panacea.datadeal.v2alpha2.DataSale');

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
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.displayName = 'proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse';
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
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    dataSale: (f = msg.getDataSale()) && proto.panacea.datadeal.v2alpha2.DataSale.toObject(includeInstance, f)
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
 * @return {!proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse}
 */
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse;
  return proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse}
 */
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.panacea.datadeal.v2alpha2.DataSale;
      reader.readMessage(value,proto.panacea.datadeal.v2alpha2.DataSale.deserializeBinaryFromReader);
      msg.setDataSale(value);
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
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDataSale();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.panacea.datadeal.v2alpha2.DataSale.serializeBinaryToWriter
    );
  }
};


/**
 * optional DataSale data_sale = 1;
 * @return {?proto.panacea.datadeal.v2alpha2.DataSale}
 */
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.prototype.getDataSale = function() {
  return /** @type{?proto.panacea.datadeal.v2alpha2.DataSale} */ (
    jspb.Message.getWrapperField(this, proto.panacea.datadeal.v2alpha2.DataSale, 1));
};


/**
 * @param {?proto.panacea.datadeal.v2alpha2.DataSale|undefined} value
 * @return {!proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse} returns this
*/
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.prototype.setDataSale = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse} returns this
 */
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.prototype.clearDataSale = function() {
  return this.setDataSale(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.datadeal.v2alpha2.QueryDataSaleResponse.prototype.hasDataSale = function() {
  return jspb.Message.getField(this, 1) != null;
};


