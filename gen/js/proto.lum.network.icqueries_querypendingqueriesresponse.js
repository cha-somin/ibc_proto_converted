// source: lum-network/icqueries/query.proto
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

goog.provide('proto.lum.network.icqueries.QueryPendingQueriesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.lum.network.icqueries.Query');

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
proto.lum.network.icqueries.QueryPendingQueriesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.lum.network.icqueries.QueryPendingQueriesResponse.repeatedFields_, null);
};
goog.inherits(proto.lum.network.icqueries.QueryPendingQueriesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.icqueries.QueryPendingQueriesResponse.displayName = 'proto.lum.network.icqueries.QueryPendingQueriesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.lum.network.icqueries.QueryPendingQueriesResponse.repeatedFields_ = [1];



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
proto.lum.network.icqueries.QueryPendingQueriesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.icqueries.QueryPendingQueriesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.icqueries.QueryPendingQueriesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.icqueries.QueryPendingQueriesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    pendingQueriesList: jspb.Message.toObjectList(msg.getPendingQueriesList(),
    proto.lum.network.icqueries.Query.toObject, includeInstance)
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
 * @return {!proto.lum.network.icqueries.QueryPendingQueriesResponse}
 */
proto.lum.network.icqueries.QueryPendingQueriesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.icqueries.QueryPendingQueriesResponse;
  return proto.lum.network.icqueries.QueryPendingQueriesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.icqueries.QueryPendingQueriesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.icqueries.QueryPendingQueriesResponse}
 */
proto.lum.network.icqueries.QueryPendingQueriesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.lum.network.icqueries.Query;
      reader.readMessage(value,proto.lum.network.icqueries.Query.deserializeBinaryFromReader);
      msg.addPendingQueries(value);
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
proto.lum.network.icqueries.QueryPendingQueriesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.icqueries.QueryPendingQueriesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.icqueries.QueryPendingQueriesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.icqueries.QueryPendingQueriesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPendingQueriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.lum.network.icqueries.Query.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Query pending_queries = 1;
 * @return {!Array<!proto.lum.network.icqueries.Query>}
 */
proto.lum.network.icqueries.QueryPendingQueriesResponse.prototype.getPendingQueriesList = function() {
  return /** @type{!Array<!proto.lum.network.icqueries.Query>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.lum.network.icqueries.Query, 1));
};


/**
 * @param {!Array<!proto.lum.network.icqueries.Query>} value
 * @return {!proto.lum.network.icqueries.QueryPendingQueriesResponse} returns this
*/
proto.lum.network.icqueries.QueryPendingQueriesResponse.prototype.setPendingQueriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.lum.network.icqueries.Query=} opt_value
 * @param {number=} opt_index
 * @return {!proto.lum.network.icqueries.Query}
 */
proto.lum.network.icqueries.QueryPendingQueriesResponse.prototype.addPendingQueries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.lum.network.icqueries.Query, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.lum.network.icqueries.QueryPendingQueriesResponse} returns this
 */
proto.lum.network.icqueries.QueryPendingQueriesResponse.prototype.clearPendingQueriesList = function() {
  return this.setPendingQueriesList([]);
};

