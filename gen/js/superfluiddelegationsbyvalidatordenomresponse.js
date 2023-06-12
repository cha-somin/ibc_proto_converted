// source: osmosis/superfluid/query.proto
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

goog.provide('proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.superfluid.SuperfluidDelegationRecord');

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
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.repeatedFields_, null);
};
goog.inherits(proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.displayName = 'proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.repeatedFields_ = [1];



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
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    superfluidDelegationRecordsList: jspb.Message.toObjectList(msg.getSuperfluidDelegationRecordsList(),
    proto.osmosis.superfluid.SuperfluidDelegationRecord.toObject, includeInstance)
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
 * @return {!proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse}
 */
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse;
  return proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse}
 */
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.superfluid.SuperfluidDelegationRecord;
      reader.readMessage(value,proto.osmosis.superfluid.SuperfluidDelegationRecord.deserializeBinaryFromReader);
      msg.addSuperfluidDelegationRecords(value);
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
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSuperfluidDelegationRecordsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.osmosis.superfluid.SuperfluidDelegationRecord.serializeBinaryToWriter
    );
  }
};


/**
 * repeated SuperfluidDelegationRecord superfluid_delegation_records = 1;
 * @return {!Array<!proto.osmosis.superfluid.SuperfluidDelegationRecord>}
 */
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.prototype.getSuperfluidDelegationRecordsList = function() {
  return /** @type{!Array<!proto.osmosis.superfluid.SuperfluidDelegationRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.superfluid.SuperfluidDelegationRecord, 1));
};


/**
 * @param {!Array<!proto.osmosis.superfluid.SuperfluidDelegationRecord>} value
 * @return {!proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse} returns this
*/
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.prototype.setSuperfluidDelegationRecordsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.osmosis.superfluid.SuperfluidDelegationRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.superfluid.SuperfluidDelegationRecord}
 */
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.prototype.addSuperfluidDelegationRecords = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.osmosis.superfluid.SuperfluidDelegationRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse} returns this
 */
proto.osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse.prototype.clearSuperfluidDelegationRecordsList = function() {
  return this.setSuperfluidDelegationRecordsList([]);
};


