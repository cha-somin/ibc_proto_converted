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

goog.provide('proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageRequest');

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
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.displayName = 'proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest';
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
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageRequest.toObject(includeInstance, f),
    portId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    channelId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    queryHeight: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest}
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest;
  return proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest}
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.query.v1beta1.PageRequest;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageRequest.deserializeBinaryFromReader);
      msg.setPagination(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPortId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setChannelId(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setQueryHeight(value);
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
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.query.v1beta1.PageRequest.serializeBinaryToWriter
    );
  }
  f = message.getPortId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getChannelId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getQueryHeight();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional cosmos.base.query.v1beta1.PageRequest pagination = 1;
 * @return {?proto.cosmos.base.query.v1beta1.PageRequest}
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageRequest} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageRequest, 1));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageRequest|undefined} value
 * @return {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest} returns this
*/
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest} returns this
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string port_id = 2;
 * @return {string}
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.getPortId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest} returns this
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.setPortId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string channel_id = 3;
 * @return {string}
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.getChannelId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest} returns this
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.setChannelId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 query_height = 4;
 * @return {number}
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.getQueryHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest} returns this
 */
proto.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.prototype.setQueryHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


