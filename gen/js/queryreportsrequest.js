// source: desmos/reports/v1/query.proto
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

goog.provide('proto.desmos.reports.v1.QueryReportsRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageRequest');
goog.require('proto.google.protobuf.Any');

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
proto.desmos.reports.v1.QueryReportsRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.reports.v1.QueryReportsRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.reports.v1.QueryReportsRequest.displayName = 'proto.desmos.reports.v1.QueryReportsRequest';
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
proto.desmos.reports.v1.QueryReportsRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.reports.v1.QueryReportsRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.reports.v1.QueryReportsRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reports.v1.QueryReportsRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    subspaceId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    target: (f = msg.getTarget()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    reporter: jspb.Message.getFieldWithDefault(msg, 3, ""),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageRequest.toObject(includeInstance, f)
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
 * @return {!proto.desmos.reports.v1.QueryReportsRequest}
 */
proto.desmos.reports.v1.QueryReportsRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.reports.v1.QueryReportsRequest;
  return proto.desmos.reports.v1.QueryReportsRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.reports.v1.QueryReportsRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.reports.v1.QueryReportsRequest}
 */
proto.desmos.reports.v1.QueryReportsRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSubspaceId(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setTarget(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setReporter(value);
      break;
    case 4:
      var value = new proto.cosmos.base.query.v1beta1.PageRequest;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageRequest.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.desmos.reports.v1.QueryReportsRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.reports.v1.QueryReportsRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.reports.v1.QueryReportsRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reports.v1.QueryReportsRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubspaceId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getTarget();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getReporter();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.query.v1beta1.PageRequest.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 subspace_id = 1;
 * @return {number}
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reports.v1.QueryReportsRequest} returns this
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional google.protobuf.Any target = 2;
 * @return {?proto.google.protobuf.Any}
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.getTarget = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 2));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.desmos.reports.v1.QueryReportsRequest} returns this
*/
proto.desmos.reports.v1.QueryReportsRequest.prototype.setTarget = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.reports.v1.QueryReportsRequest} returns this
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.clearTarget = function() {
  return this.setTarget(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.hasTarget = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string reporter = 3;
 * @return {string}
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.getReporter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.reports.v1.QueryReportsRequest} returns this
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.setReporter = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.query.v1beta1.PageRequest pagination = 4;
 * @return {?proto.cosmos.base.query.v1beta1.PageRequest}
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageRequest} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageRequest, 4));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageRequest|undefined} value
 * @return {!proto.desmos.reports.v1.QueryReportsRequest} returns this
*/
proto.desmos.reports.v1.QueryReportsRequest.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.reports.v1.QueryReportsRequest} returns this
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.reports.v1.QueryReportsRequest.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 4) != null;
};


