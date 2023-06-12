// source: kava/hard/v1beta1/query.proto
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

goog.provide('proto.kava.hard.v1beta1.QueryInterestFactorsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.hard.v1beta1.InterestFactor');

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
proto.kava.hard.v1beta1.QueryInterestFactorsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.hard.v1beta1.QueryInterestFactorsResponse.repeatedFields_, null);
};
goog.inherits(proto.kava.hard.v1beta1.QueryInterestFactorsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.hard.v1beta1.QueryInterestFactorsResponse.displayName = 'proto.kava.hard.v1beta1.QueryInterestFactorsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.repeatedFields_ = [1];



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
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.hard.v1beta1.QueryInterestFactorsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.hard.v1beta1.QueryInterestFactorsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    interestFactorsList: jspb.Message.toObjectList(msg.getInterestFactorsList(),
    proto.kava.hard.v1beta1.InterestFactor.toObject, includeInstance)
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
 * @return {!proto.kava.hard.v1beta1.QueryInterestFactorsResponse}
 */
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.hard.v1beta1.QueryInterestFactorsResponse;
  return proto.kava.hard.v1beta1.QueryInterestFactorsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.hard.v1beta1.QueryInterestFactorsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.hard.v1beta1.QueryInterestFactorsResponse}
 */
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kava.hard.v1beta1.InterestFactor;
      reader.readMessage(value,proto.kava.hard.v1beta1.InterestFactor.deserializeBinaryFromReader);
      msg.addInterestFactors(value);
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
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.hard.v1beta1.QueryInterestFactorsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.hard.v1beta1.QueryInterestFactorsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInterestFactorsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.kava.hard.v1beta1.InterestFactor.serializeBinaryToWriter
    );
  }
};


/**
 * repeated InterestFactor interest_factors = 1;
 * @return {!Array<!proto.kava.hard.v1beta1.InterestFactor>}
 */
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.prototype.getInterestFactorsList = function() {
  return /** @type{!Array<!proto.kava.hard.v1beta1.InterestFactor>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.hard.v1beta1.InterestFactor, 1));
};


/**
 * @param {!Array<!proto.kava.hard.v1beta1.InterestFactor>} value
 * @return {!proto.kava.hard.v1beta1.QueryInterestFactorsResponse} returns this
*/
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.prototype.setInterestFactorsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.kava.hard.v1beta1.InterestFactor=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.hard.v1beta1.InterestFactor}
 */
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.prototype.addInterestFactors = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.kava.hard.v1beta1.InterestFactor, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.hard.v1beta1.QueryInterestFactorsResponse} returns this
 */
proto.kava.hard.v1beta1.QueryInterestFactorsResponse.prototype.clearInterestFactorsList = function() {
  return this.setInterestFactorsList([]);
};


