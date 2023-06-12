# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from irismod.htlc import tx_pb2 as irismod_dot_htlc_dot_tx__pb2


class MsgStub(object):
    """Msg defines the HTLC Msg service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateHTLC = channel.unary_unary(
                '/irismod.htlc.Msg/CreateHTLC',
                request_serializer=irismod_dot_htlc_dot_tx__pb2.MsgCreateHTLC.SerializeToString,
                response_deserializer=irismod_dot_htlc_dot_tx__pb2.MsgCreateHTLCResponse.FromString,
                )
        self.ClaimHTLC = channel.unary_unary(
                '/irismod.htlc.Msg/ClaimHTLC',
                request_serializer=irismod_dot_htlc_dot_tx__pb2.MsgClaimHTLC.SerializeToString,
                response_deserializer=irismod_dot_htlc_dot_tx__pb2.MsgClaimHTLCResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the HTLC Msg service
    """

    def CreateHTLC(self, request, context):
        """CreateHTLC defines a method for creating a HTLC
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClaimHTLC(self, request, context):
        """ClaimHTLC defines a method for claiming a HTLC
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateHTLC': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateHTLC,
                    request_deserializer=irismod_dot_htlc_dot_tx__pb2.MsgCreateHTLC.FromString,
                    response_serializer=irismod_dot_htlc_dot_tx__pb2.MsgCreateHTLCResponse.SerializeToString,
            ),
            'ClaimHTLC': grpc.unary_unary_rpc_method_handler(
                    servicer.ClaimHTLC,
                    request_deserializer=irismod_dot_htlc_dot_tx__pb2.MsgClaimHTLC.FromString,
                    response_serializer=irismod_dot_htlc_dot_tx__pb2.MsgClaimHTLCResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'irismod.htlc.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the HTLC Msg service
    """

    @staticmethod
    def CreateHTLC(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/irismod.htlc.Msg/CreateHTLC',
            irismod_dot_htlc_dot_tx__pb2.MsgCreateHTLC.SerializeToString,
            irismod_dot_htlc_dot_tx__pb2.MsgCreateHTLCResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClaimHTLC(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/irismod.htlc.Msg/ClaimHTLC',
            irismod_dot_htlc_dot_tx__pb2.MsgClaimHTLC.SerializeToString,
            irismod_dot_htlc_dot_tx__pb2.MsgClaimHTLCResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
