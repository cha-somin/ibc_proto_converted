// source: osmosis/pool-incentives/v1beta1/gov.proto
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

goog.provide('proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.poolincentives.v1beta1.DistrRecord');

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
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.repeatedFields_, null);
};
goog.inherits(proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.displayName = 'proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.repeatedFields_ = [3];



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
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    recordsList: jspb.Message.toObjectList(msg.getRecordsList(),
    proto.osmosis.poolincentives.v1beta1.DistrRecord.toObject, includeInstance)
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
 * @return {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal}
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal;
  return proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal}
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = new proto.osmosis.poolincentives.v1beta1.DistrRecord;
      reader.readMessage(value,proto.osmosis.poolincentives.v1beta1.DistrRecord.deserializeBinaryFromReader);
      msg.addRecords(value);
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
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRecordsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.osmosis.poolincentives.v1beta1.DistrRecord.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal} returns this
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal} returns this
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated DistrRecord records = 3;
 * @return {!Array<!proto.osmosis.poolincentives.v1beta1.DistrRecord>}
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.getRecordsList = function() {
  return /** @type{!Array<!proto.osmosis.poolincentives.v1beta1.DistrRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.poolincentives.v1beta1.DistrRecord, 3));
};


/**
 * @param {!Array<!proto.osmosis.poolincentives.v1beta1.DistrRecord>} value
 * @return {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal} returns this
*/
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.setRecordsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.osmosis.poolincentives.v1beta1.DistrRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.poolincentives.v1beta1.DistrRecord}
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.addRecords = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.osmosis.poolincentives.v1beta1.DistrRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal} returns this
 */
proto.osmosis.poolincentives.v1beta1.ReplacePoolIncentivesProposal.prototype.clearRecordsList = function() {
  return this.setRecordsList([]);
};


