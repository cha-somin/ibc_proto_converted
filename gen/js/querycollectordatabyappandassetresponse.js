// source: comdex/collector/v1beta1/query.proto
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

goog.provide('proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.collector.v1beta1.CollectorData');

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
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.displayName = 'proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse';
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
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    collectordata: (f = msg.getCollectordata()) && proto.comdex.collector.v1beta1.CollectorData.toObject(includeInstance, f)
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
 * @return {!proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse}
 */
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse;
  return proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse}
 */
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.collector.v1beta1.CollectorData;
      reader.readMessage(value,proto.comdex.collector.v1beta1.CollectorData.deserializeBinaryFromReader);
      msg.setCollectordata(value);
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
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCollectordata();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.comdex.collector.v1beta1.CollectorData.serializeBinaryToWriter
    );
  }
};


/**
 * optional CollectorData collectorData = 1;
 * @return {?proto.comdex.collector.v1beta1.CollectorData}
 */
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.prototype.getCollectordata = function() {
  return /** @type{?proto.comdex.collector.v1beta1.CollectorData} */ (
    jspb.Message.getWrapperField(this, proto.comdex.collector.v1beta1.CollectorData, 1));
};


/**
 * @param {?proto.comdex.collector.v1beta1.CollectorData|undefined} value
 * @return {!proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse} returns this
*/
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.prototype.setCollectordata = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse} returns this
 */
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.prototype.clearCollectordata = function() {
  return this.setCollectordata(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse.prototype.hasCollectordata = function() {
  return jspb.Message.getField(this, 1) != null;
};


