// source: regen/ecocredit/v1alpha2/events.proto
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

goog.provide('proto.regen.ecocredit.v1alpha2.EventCreateBatch');

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
proto.regen.ecocredit.v1alpha2.EventCreateBatch = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.EventCreateBatch, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.EventCreateBatch.displayName = 'proto.regen.ecocredit.v1alpha2.EventCreateBatch';
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
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.EventCreateBatch.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.toObject = function(includeInstance, msg) {
  var f, obj = {
    classId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    batchDenom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    issuer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    totalAmount: jspb.Message.getFieldWithDefault(msg, 4, ""),
    startDate: jspb.Message.getFieldWithDefault(msg, 5, ""),
    endDate: jspb.Message.getFieldWithDefault(msg, 6, ""),
    projectLocation: jspb.Message.getFieldWithDefault(msg, 7, ""),
    projectId: jspb.Message.getFieldWithDefault(msg, 8, "")
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
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.EventCreateBatch;
  return proto.regen.ecocredit.v1alpha2.EventCreateBatch.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setClassId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBatchDenom(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setIssuer(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalAmount(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setStartDate(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setEndDate(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setProjectLocation(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setProjectId(value);
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
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.EventCreateBatch.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClassId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBatchDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getIssuer();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getTotalAmount();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getStartDate();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getEndDate();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getProjectLocation();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getProjectId();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
};


/**
 * optional string class_id = 1;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.getClassId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} returns this
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.setClassId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string batch_denom = 2;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.getBatchDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} returns this
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.setBatchDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string issuer = 3;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.getIssuer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} returns this
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.setIssuer = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string total_amount = 4;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.getTotalAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} returns this
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.setTotalAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string start_date = 5;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.getStartDate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} returns this
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.setStartDate = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string end_date = 6;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.getEndDate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} returns this
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.setEndDate = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string project_location = 7;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.getProjectLocation = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} returns this
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.setProjectLocation = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string project_id = 8;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.getProjectId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.EventCreateBatch} returns this
 */
proto.regen.ecocredit.v1alpha2.EventCreateBatch.prototype.setProjectId = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};

