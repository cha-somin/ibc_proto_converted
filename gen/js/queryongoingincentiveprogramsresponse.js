// source: umee/incentive/v1/query.proto
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

goog.provide('proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.umee.incentive.v1.IncentiveProgram');

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
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.repeatedFields_, null);
};
goog.inherits(proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.displayName = 'proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.repeatedFields_ = [1];



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
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    programsList: jspb.Message.toObjectList(msg.getProgramsList(),
    proto.umee.incentive.v1.IncentiveProgram.toObject, includeInstance)
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
 * @return {!proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse}
 */
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse;
  return proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse}
 */
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.umee.incentive.v1.IncentiveProgram;
      reader.readMessage(value,proto.umee.incentive.v1.IncentiveProgram.deserializeBinaryFromReader);
      msg.addPrograms(value);
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
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProgramsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.umee.incentive.v1.IncentiveProgram.serializeBinaryToWriter
    );
  }
};


/**
 * repeated IncentiveProgram programs = 1;
 * @return {!Array<!proto.umee.incentive.v1.IncentiveProgram>}
 */
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.prototype.getProgramsList = function() {
  return /** @type{!Array<!proto.umee.incentive.v1.IncentiveProgram>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.incentive.v1.IncentiveProgram, 1));
};


/**
 * @param {!Array<!proto.umee.incentive.v1.IncentiveProgram>} value
 * @return {!proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse} returns this
*/
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.prototype.setProgramsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.umee.incentive.v1.IncentiveProgram=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.incentive.v1.IncentiveProgram}
 */
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.prototype.addPrograms = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.umee.incentive.v1.IncentiveProgram, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse} returns this
 */
proto.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.prototype.clearProgramsList = function() {
  return this.setProgramsList([]);
};


