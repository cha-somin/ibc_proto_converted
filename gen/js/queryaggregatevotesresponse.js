// source: umee/oracle/v1/query.proto
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

goog.provide('proto.umee.oracle.v1.QueryAggregateVotesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.umee.oracle.v1.AggregateExchangeRateVote');

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
proto.umee.oracle.v1.QueryAggregateVotesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.umee.oracle.v1.QueryAggregateVotesResponse.repeatedFields_, null);
};
goog.inherits(proto.umee.oracle.v1.QueryAggregateVotesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.oracle.v1.QueryAggregateVotesResponse.displayName = 'proto.umee.oracle.v1.QueryAggregateVotesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.umee.oracle.v1.QueryAggregateVotesResponse.repeatedFields_ = [1];



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
proto.umee.oracle.v1.QueryAggregateVotesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.oracle.v1.QueryAggregateVotesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.oracle.v1.QueryAggregateVotesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.oracle.v1.QueryAggregateVotesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    aggregateVotesList: jspb.Message.toObjectList(msg.getAggregateVotesList(),
    proto.umee.oracle.v1.AggregateExchangeRateVote.toObject, includeInstance)
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
 * @return {!proto.umee.oracle.v1.QueryAggregateVotesResponse}
 */
proto.umee.oracle.v1.QueryAggregateVotesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.oracle.v1.QueryAggregateVotesResponse;
  return proto.umee.oracle.v1.QueryAggregateVotesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.oracle.v1.QueryAggregateVotesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.oracle.v1.QueryAggregateVotesResponse}
 */
proto.umee.oracle.v1.QueryAggregateVotesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.umee.oracle.v1.AggregateExchangeRateVote;
      reader.readMessage(value,proto.umee.oracle.v1.AggregateExchangeRateVote.deserializeBinaryFromReader);
      msg.addAggregateVotes(value);
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
proto.umee.oracle.v1.QueryAggregateVotesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.oracle.v1.QueryAggregateVotesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.oracle.v1.QueryAggregateVotesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.oracle.v1.QueryAggregateVotesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAggregateVotesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.umee.oracle.v1.AggregateExchangeRateVote.serializeBinaryToWriter
    );
  }
};


/**
 * repeated AggregateExchangeRateVote aggregate_votes = 1;
 * @return {!Array<!proto.umee.oracle.v1.AggregateExchangeRateVote>}
 */
proto.umee.oracle.v1.QueryAggregateVotesResponse.prototype.getAggregateVotesList = function() {
  return /** @type{!Array<!proto.umee.oracle.v1.AggregateExchangeRateVote>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.oracle.v1.AggregateExchangeRateVote, 1));
};


/**
 * @param {!Array<!proto.umee.oracle.v1.AggregateExchangeRateVote>} value
 * @return {!proto.umee.oracle.v1.QueryAggregateVotesResponse} returns this
*/
proto.umee.oracle.v1.QueryAggregateVotesResponse.prototype.setAggregateVotesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.umee.oracle.v1.AggregateExchangeRateVote=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.oracle.v1.AggregateExchangeRateVote}
 */
proto.umee.oracle.v1.QueryAggregateVotesResponse.prototype.addAggregateVotes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.umee.oracle.v1.AggregateExchangeRateVote, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.oracle.v1.QueryAggregateVotesResponse} returns this
 */
proto.umee.oracle.v1.QueryAggregateVotesResponse.prototype.clearAggregateVotesList = function() {
  return this.setAggregateVotesList([]);
};


