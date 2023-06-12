# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from irismod.record import tx_pb2 as irismod_dot_record_dot_tx__pb2


class MsgStub(object):
    """Msg defines the oracle Msg service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateRecord = channel.unary_unary(
                '/irismod.record.Msg/CreateRecord',
                request_serializer=irismod_dot_record_dot_tx__pb2.MsgCreateRecord.SerializeToString,
                response_deserializer=irismod_dot_record_dot_tx__pb2.MsgCreateRecordResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the oracle Msg service
    """

    def CreateRecord(self, request, context):
        """CreateRecord defines a method for creating a new record
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateRecord': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateRecord,
                    request_deserializer=irismod_dot_record_dot_tx__pb2.MsgCreateRecord.FromString,
                    response_serializer=irismod_dot_record_dot_tx__pb2.MsgCreateRecordResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'irismod.record.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the oracle Msg service
    """

    @staticmethod
    def CreateRecord(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/irismod.record.Msg/CreateRecord',
            irismod_dot_record_dot_tx__pb2.MsgCreateRecord.SerializeToString,
            irismod_dot_record_dot_tx__pb2.MsgCreateRecordResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
