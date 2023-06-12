// source: desmos/reports/v1/msgs.proto
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

goog.provide('proto.desmos.reports.v1.MsgDeleteReport');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.desmos.reports.v1.MsgDeleteReport = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.reports.v1.MsgDeleteReport, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.reports.v1.MsgDeleteReport.displayName = 'proto.desmos.reports.v1.MsgDeleteReport';
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
proto.desmos.reports.v1.MsgDeleteReport.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.reports.v1.MsgDeleteReport.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.reports.v1.MsgDeleteReport} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reports.v1.MsgDeleteReport.toObject = function(includeInstance, msg) {
  var f, obj = {
    subspaceId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    reportId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    signer: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.desmos.reports.v1.MsgDeleteReport}
 */
proto.desmos.reports.v1.MsgDeleteReport.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.reports.v1.MsgDeleteReport;
  return proto.desmos.reports.v1.MsgDeleteReport.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.reports.v1.MsgDeleteReport} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.reports.v1.MsgDeleteReport}
 */
proto.desmos.reports.v1.MsgDeleteReport.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {number} */ (reader.readUint64());
      msg.setReportId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
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
proto.desmos.reports.v1.MsgDeleteReport.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.reports.v1.MsgDeleteReport.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.reports.v1.MsgDeleteReport} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reports.v1.MsgDeleteReport.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubspaceId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getReportId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional uint64 subspace_id = 1;
 * @return {number}
 */
proto.desmos.reports.v1.MsgDeleteReport.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reports.v1.MsgDeleteReport} returns this
 */
proto.desmos.reports.v1.MsgDeleteReport.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 report_id = 2;
 * @return {number}
 */
proto.desmos.reports.v1.MsgDeleteReport.prototype.getReportId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reports.v1.MsgDeleteReport} returns this
 */
proto.desmos.reports.v1.MsgDeleteReport.prototype.setReportId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string signer = 3;
 * @return {string}
 */
proto.desmos.reports.v1.MsgDeleteReport.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.reports.v1.MsgDeleteReport} returns this
 */
proto.desmos.reports.v1.MsgDeleteReport.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


