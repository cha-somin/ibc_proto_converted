// source: quasar/qoracle/osmosis/query.proto
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

goog.provide('proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.quasarlabs.quasarnode.qoracle.osmosis.Params');

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
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.displayName = 'proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse';
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
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.quasarlabs.quasarnode.qoracle.osmosis.Params.toObject(includeInstance, f)
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
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse;
  return proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.quasarlabs.quasarnode.qoracle.osmosis.Params;
      reader.readMessage(value,proto.quasarlabs.quasarnode.qoracle.osmosis.Params.deserializeBinaryFromReader);
      msg.setParams(value);
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
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.quasarlabs.quasarnode.qoracle.osmosis.Params.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.quasarlabs.quasarnode.qoracle.osmosis.Params}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.prototype.getParams = function() {
  return /** @type{?proto.quasarlabs.quasarnode.qoracle.osmosis.Params} */ (
    jspb.Message.getWrapperField(this, proto.quasarlabs.quasarnode.qoracle.osmosis.Params, 1));
};


/**
 * @param {?proto.quasarlabs.quasarnode.qoracle.osmosis.Params|undefined} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse} returns this
*/
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


