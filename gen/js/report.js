// source: injective/ocr/v1beta1/ocr.proto
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

goog.provide('proto.injective.ocr.v1beta1.Report');

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
proto.injective.ocr.v1beta1.Report = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.ocr.v1beta1.Report.repeatedFields_, null);
};
goog.inherits(proto.injective.ocr.v1beta1.Report, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.ocr.v1beta1.Report.displayName = 'proto.injective.ocr.v1beta1.Report';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.ocr.v1beta1.Report.repeatedFields_ = [3];



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
proto.injective.ocr.v1beta1.Report.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.ocr.v1beta1.Report.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.ocr.v1beta1.Report} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.Report.toObject = function(includeInstance, msg) {
  var f, obj = {
    observationsTimestamp: jspb.Message.getFieldWithDefault(msg, 1, 0),
    observers: msg.getObservers_asB64(),
    observationsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.injective.ocr.v1beta1.Report}
 */
proto.injective.ocr.v1beta1.Report.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.ocr.v1beta1.Report;
  return proto.injective.ocr.v1beta1.Report.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.ocr.v1beta1.Report} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.ocr.v1beta1.Report}
 */
proto.injective.ocr.v1beta1.Report.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setObservationsTimestamp(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setObservers(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addObservations(value);
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
proto.injective.ocr.v1beta1.Report.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.ocr.v1beta1.Report.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.ocr.v1beta1.Report} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.Report.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getObservationsTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getObservers_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getObservationsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
};


/**
 * optional int64 observations_timestamp = 1;
 * @return {number}
 */
proto.injective.ocr.v1beta1.Report.prototype.getObservationsTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.ocr.v1beta1.Report} returns this
 */
proto.injective.ocr.v1beta1.Report.prototype.setObservationsTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional bytes observers = 2;
 * @return {string}
 */
proto.injective.ocr.v1beta1.Report.prototype.getObservers = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes observers = 2;
 * This is a type-conversion wrapper around `getObservers()`
 * @return {string}
 */
proto.injective.ocr.v1beta1.Report.prototype.getObservers_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getObservers()));
};


/**
 * optional bytes observers = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getObservers()`
 * @return {!Uint8Array}
 */
proto.injective.ocr.v1beta1.Report.prototype.getObservers_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getObservers()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.ocr.v1beta1.Report} returns this
 */
proto.injective.ocr.v1beta1.Report.prototype.setObservers = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * repeated string observations = 3;
 * @return {!Array<string>}
 */
proto.injective.ocr.v1beta1.Report.prototype.getObservationsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.ocr.v1beta1.Report} returns this
 */
proto.injective.ocr.v1beta1.Report.prototype.setObservationsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.ocr.v1beta1.Report} returns this
 */
proto.injective.ocr.v1beta1.Report.prototype.addObservations = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.ocr.v1beta1.Report} returns this
 */
proto.injective.ocr.v1beta1.Report.prototype.clearObservationsList = function() {
  return this.setObservationsList([]);
};


