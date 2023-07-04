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

goog.provide('proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest');

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
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.displayName = 'proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest';
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
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageRequest.toObject(includeInstance, f),
    queryHeight: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest}
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest;
  return proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest}
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.deserializeBinaryFromReader = function(msg, reader) {
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
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.query.v1beta1.PageRequest.serializeBinaryToWriter
    );
  }
  f = message.getQueryHeight();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
};


/**
 * optional cosmos.base.query.v1beta1.PageRequest pagination = 1;
 * @return {?proto.cosmos.base.query.v1beta1.PageRequest}
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageRequest} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageRequest, 1));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageRequest|undefined} value
 * @return {!proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest} returns this
*/
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest} returns this
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional uint64 query_height = 2;
 * @return {number}
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.prototype.getQueryHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest} returns this
 */
proto.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.prototype.setQueryHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};

