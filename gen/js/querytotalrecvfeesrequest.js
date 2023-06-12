// source: ibc/applications/fee/v1/query.proto
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

goog.provide('proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.core.channel.v1.PacketId');

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
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.displayName = 'proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest';
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
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    packetId: (f = msg.getPacketId()) && proto.ibc.core.channel.v1.PacketId.toObject(includeInstance, f)
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
 * @return {!proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest}
 */
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest;
  return proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest}
 */
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ibc.core.channel.v1.PacketId;
      reader.readMessage(value,proto.ibc.core.channel.v1.PacketId.deserializeBinaryFromReader);
      msg.setPacketId(value);
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
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPacketId();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.ibc.core.channel.v1.PacketId.serializeBinaryToWriter
    );
  }
};


/**
 * optional ibc.core.channel.v1.PacketId packet_id = 1;
 * @return {?proto.ibc.core.channel.v1.PacketId}
 */
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.prototype.getPacketId = function() {
  return /** @type{?proto.ibc.core.channel.v1.PacketId} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.channel.v1.PacketId, 1));
};


/**
 * @param {?proto.ibc.core.channel.v1.PacketId|undefined} value
 * @return {!proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest} returns this
*/
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.prototype.setPacketId = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest} returns this
 */
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.prototype.clearPacketId = function() {
  return this.setPacketId(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.prototype.hasPacketId = function() {
  return jspb.Message.getField(this, 1) != null;
};


