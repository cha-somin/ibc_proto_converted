// source: secret/registration/v1beta1/remote_attestation/types.proto
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

goog.provide('proto.secret.registration.remote_attestation.v1beta1.QuoteReport');

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
proto.secret.registration.remote_attestation.v1beta1.QuoteReport = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.secret.registration.remote_attestation.v1beta1.QuoteReport.repeatedFields_, null);
};
goog.inherits(proto.secret.registration.remote_attestation.v1beta1.QuoteReport, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.secret.registration.remote_attestation.v1beta1.QuoteReport.displayName = 'proto.secret.registration.remote_attestation.v1beta1.QuoteReport';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.repeatedFields_ = [7];



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
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.toObject = function(opt_includeInstance) {
  return proto.secret.registration.remote_attestation.v1beta1.QuoteReport.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    timestamp: jspb.Message.getFieldWithDefault(msg, 2, ""),
    version: jspb.Message.getFieldWithDefault(msg, 3, 0),
    isvEnclaveQuoteStatus: jspb.Message.getFieldWithDefault(msg, 4, ""),
    platformInfoBlob: jspb.Message.getFieldWithDefault(msg, 5, ""),
    isvEnclaveQuoteBody: jspb.Message.getFieldWithDefault(msg, 6, ""),
    advisoryIdsList: (f = jspb.Message.getRepeatedField(msg, 7)) == null ? undefined : f
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
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.secret.registration.remote_attestation.v1beta1.QuoteReport;
  return proto.secret.registration.remote_attestation.v1beta1.QuoteReport.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTimestamp(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setVersion(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setIsvEnclaveQuoteStatus(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setPlatformInfoBlob(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setIsvEnclaveQuoteBody(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.addAdvisoryIds(value);
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
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.secret.registration.remote_attestation.v1beta1.QuoteReport.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTimestamp();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getVersion();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getIsvEnclaveQuoteStatus();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getPlatformInfoBlob();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getIsvEnclaveQuoteBody();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getAdvisoryIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      7,
      f
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string timestamp = 2;
 * @return {string}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.getTimestamp = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.setTimestamp = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 version = 3;
 * @return {number}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.getVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.setVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string isv_enclave_quote_status = 4;
 * @return {string}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.getIsvEnclaveQuoteStatus = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.setIsvEnclaveQuoteStatus = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string platform_info_blob = 5;
 * @return {string}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.getPlatformInfoBlob = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.setPlatformInfoBlob = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string isv_enclave_quote_body = 6;
 * @return {string}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.getIsvEnclaveQuoteBody = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.setIsvEnclaveQuoteBody = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * repeated string advisory_ids = 7;
 * @return {!Array<string>}
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.getAdvisoryIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 7));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.setAdvisoryIdsList = function(value) {
  return jspb.Message.setField(this, 7, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.addAdvisoryIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 7, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.secret.registration.remote_attestation.v1beta1.QuoteReport} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.QuoteReport.prototype.clearAdvisoryIdsList = function() {
  return this.setAdvisoryIdsList([]);
};


