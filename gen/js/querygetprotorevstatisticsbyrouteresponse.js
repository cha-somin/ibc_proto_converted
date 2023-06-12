// source: osmosis/protorev/v1beta1/query.proto
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

goog.provide('proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.protorev.v1beta1.RouteStatistics');

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
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.displayName = 'proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse';
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
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    statistics: (f = msg.getStatistics()) && proto.osmosis.protorev.v1beta1.RouteStatistics.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse}
 */
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse;
  return proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse}
 */
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.protorev.v1beta1.RouteStatistics;
      reader.readMessage(value,proto.osmosis.protorev.v1beta1.RouteStatistics.deserializeBinaryFromReader);
      msg.setStatistics(value);
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
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStatistics();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.osmosis.protorev.v1beta1.RouteStatistics.serializeBinaryToWriter
    );
  }
};


/**
 * optional RouteStatistics statistics = 1;
 * @return {?proto.osmosis.protorev.v1beta1.RouteStatistics}
 */
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.prototype.getStatistics = function() {
  return /** @type{?proto.osmosis.protorev.v1beta1.RouteStatistics} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.protorev.v1beta1.RouteStatistics, 1));
};


/**
 * @param {?proto.osmosis.protorev.v1beta1.RouteStatistics|undefined} value
 * @return {!proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse} returns this
*/
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.prototype.setStatistics = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse} returns this
 */
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.prototype.clearStatistics = function() {
  return this.setStatistics(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse.prototype.hasStatistics = function() {
  return jspb.Message.getField(this, 1) != null;
};


