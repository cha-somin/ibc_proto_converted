// source: osmosis/downtime-detector/v1beta1/genesis.proto
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

goog.provide('proto.osmosis.downtimedetector.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry');

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
proto.osmosis.downtimedetector.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.downtimedetector.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.osmosis.downtimedetector.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.downtimedetector.v1beta1.GenesisState.displayName = 'proto.osmosis.downtimedetector.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.repeatedFields_ = [1];



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
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.downtimedetector.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.downtimedetector.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    downtimesList: jspb.Message.toObjectList(msg.getDowntimesList(),
    proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry.toObject, includeInstance),
    lastBlockTime: (f = msg.getLastBlockTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.downtimedetector.v1beta1.GenesisState}
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.downtimedetector.v1beta1.GenesisState;
  return proto.osmosis.downtimedetector.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.downtimedetector.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.downtimedetector.v1beta1.GenesisState}
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry;
      reader.readMessage(value,proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry.deserializeBinaryFromReader);
      msg.addDowntimes(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setLastBlockTime(value);
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
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.downtimedetector.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.downtimedetector.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDowntimesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry.serializeBinaryToWriter
    );
  }
  f = message.getLastBlockTime();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * repeated GenesisDowntimeEntry downtimes = 1;
 * @return {!Array<!proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry>}
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.getDowntimesList = function() {
  return /** @type{!Array<!proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry, 1));
};


/**
 * @param {!Array<!proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry>} value
 * @return {!proto.osmosis.downtimedetector.v1beta1.GenesisState} returns this
*/
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.setDowntimesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry}
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.addDowntimes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.downtimedetector.v1beta1.GenesisState} returns this
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.clearDowntimesList = function() {
  return this.setDowntimesList([]);
};


/**
 * optional google.protobuf.Timestamp last_block_time = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.getLastBlockTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.osmosis.downtimedetector.v1beta1.GenesisState} returns this
*/
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.setLastBlockTime = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.downtimedetector.v1beta1.GenesisState} returns this
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.clearLastBlockTime = function() {
  return this.setLastBlockTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.downtimedetector.v1beta1.GenesisState.prototype.hasLastBlockTime = function() {
  return jspb.Message.getField(this, 2) != null;
};


