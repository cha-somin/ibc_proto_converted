// source: neutron/interchainqueries/tx.proto
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

goog.provide('proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.neutron.interchainqueries.KVKey');

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
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.repeatedFields_, null);
};
goog.inherits(proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.displayName = 'proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.repeatedFields_ = [2];



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
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    queryId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    newKeysList: jspb.Message.toObjectList(msg.getNewKeysList(),
    proto.neutron.interchainqueries.KVKey.toObject, includeInstance),
    newUpdatePeriod: jspb.Message.getFieldWithDefault(msg, 3, 0),
    newTransactionsFilter: jspb.Message.getFieldWithDefault(msg, 4, ""),
    sender: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest}
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest;
  return proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest}
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setQueryId(value);
      break;
    case 2:
      var value = new proto.neutron.interchainqueries.KVKey;
      reader.readMessage(value,proto.neutron.interchainqueries.KVKey.deserializeBinaryFromReader);
      msg.addNewKeys(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNewUpdatePeriod(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setNewTransactionsFilter(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
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
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getQueryId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getNewKeysList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.neutron.interchainqueries.KVKey.serializeBinaryToWriter
    );
  }
  f = message.getNewUpdatePeriod();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getNewTransactionsFilter();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional uint64 query_id = 1;
 * @return {number}
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.getQueryId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} returns this
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.setQueryId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated KVKey new_keys = 2;
 * @return {!Array<!proto.neutron.interchainqueries.KVKey>}
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.getNewKeysList = function() {
  return /** @type{!Array<!proto.neutron.interchainqueries.KVKey>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.neutron.interchainqueries.KVKey, 2));
};


/**
 * @param {!Array<!proto.neutron.interchainqueries.KVKey>} value
 * @return {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} returns this
*/
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.setNewKeysList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.neutron.interchainqueries.KVKey=} opt_value
 * @param {number=} opt_index
 * @return {!proto.neutron.interchainqueries.KVKey}
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.addNewKeys = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.neutron.interchainqueries.KVKey, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} returns this
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.clearNewKeysList = function() {
  return this.setNewKeysList([]);
};


/**
 * optional uint64 new_update_period = 3;
 * @return {number}
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.getNewUpdatePeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} returns this
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.setNewUpdatePeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string new_transactions_filter = 4;
 * @return {string}
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.getNewTransactionsFilter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} returns this
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.setNewTransactionsFilter = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string sender = 5;
 * @return {string}
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest} returns this
 */
proto.neutron.interchainqueries.MsgUpdateInterchainQueryRequest.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


