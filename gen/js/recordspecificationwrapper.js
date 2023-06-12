// source: provenance/metadata/v1/query.proto
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

goog.provide('proto.provenance.metadata.v1.RecordSpecificationWrapper');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.RecordSpecIdInfo');
goog.require('proto.provenance.metadata.v1.RecordSpecification');

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
proto.provenance.metadata.v1.RecordSpecificationWrapper = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.metadata.v1.RecordSpecificationWrapper, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.RecordSpecificationWrapper.displayName = 'proto.provenance.metadata.v1.RecordSpecificationWrapper';
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
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.RecordSpecificationWrapper.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.RecordSpecificationWrapper} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.toObject = function(includeInstance, msg) {
  var f, obj = {
    specification: (f = msg.getSpecification()) && proto.provenance.metadata.v1.RecordSpecification.toObject(includeInstance, f),
    recordSpecIdInfo: (f = msg.getRecordSpecIdInfo()) && proto.provenance.metadata.v1.RecordSpecIdInfo.toObject(includeInstance, f)
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
 * @return {!proto.provenance.metadata.v1.RecordSpecificationWrapper}
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.RecordSpecificationWrapper;
  return proto.provenance.metadata.v1.RecordSpecificationWrapper.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.RecordSpecificationWrapper} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.RecordSpecificationWrapper}
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.RecordSpecification;
      reader.readMessage(value,proto.provenance.metadata.v1.RecordSpecification.deserializeBinaryFromReader);
      msg.setSpecification(value);
      break;
    case 2:
      var value = new proto.provenance.metadata.v1.RecordSpecIdInfo;
      reader.readMessage(value,proto.provenance.metadata.v1.RecordSpecIdInfo.deserializeBinaryFromReader);
      msg.setRecordSpecIdInfo(value);
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
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.RecordSpecificationWrapper.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.RecordSpecificationWrapper} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSpecification();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.metadata.v1.RecordSpecification.serializeBinaryToWriter
    );
  }
  f = message.getRecordSpecIdInfo();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.provenance.metadata.v1.RecordSpecIdInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional RecordSpecification specification = 1;
 * @return {?proto.provenance.metadata.v1.RecordSpecification}
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.getSpecification = function() {
  return /** @type{?proto.provenance.metadata.v1.RecordSpecification} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.RecordSpecification, 1));
};


/**
 * @param {?proto.provenance.metadata.v1.RecordSpecification|undefined} value
 * @return {!proto.provenance.metadata.v1.RecordSpecificationWrapper} returns this
*/
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.setSpecification = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.RecordSpecificationWrapper} returns this
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.clearSpecification = function() {
  return this.setSpecification(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.hasSpecification = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional RecordSpecIdInfo record_spec_id_info = 2;
 * @return {?proto.provenance.metadata.v1.RecordSpecIdInfo}
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.getRecordSpecIdInfo = function() {
  return /** @type{?proto.provenance.metadata.v1.RecordSpecIdInfo} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.RecordSpecIdInfo, 2));
};


/**
 * @param {?proto.provenance.metadata.v1.RecordSpecIdInfo|undefined} value
 * @return {!proto.provenance.metadata.v1.RecordSpecificationWrapper} returns this
*/
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.setRecordSpecIdInfo = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.RecordSpecificationWrapper} returns this
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.clearRecordSpecIdInfo = function() {
  return this.setRecordSpecIdInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.RecordSpecificationWrapper.prototype.hasRecordSpecIdInfo = function() {
  return jspb.Message.getField(this, 2) != null;
};


