# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from em.issuer.v1 import query_pb2 as em_dot_issuer_dot_v1_dot_query__pb2


class QueryStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Issuers = channel.unary_unary(
                '/em.issuer.v1.Query/Issuers',
                request_serializer=em_dot_issuer_dot_v1_dot_query__pb2.QueryIssuersRequest.SerializeToString,
                response_deserializer=em_dot_issuer_dot_v1_dot_query__pb2.QueryIssuersResponse.FromString,
                )


class QueryServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Issuers(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Issuers': grpc.unary_unary_rpc_method_handler(
                    servicer.Issuers,
                    request_deserializer=em_dot_issuer_dot_v1_dot_query__pb2.QueryIssuersRequest.FromString,
                    response_serializer=em_dot_issuer_dot_v1_dot_query__pb2.QueryIssuersResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'em.issuer.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Issuers(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/em.issuer.v1.Query/Issuers',
            em_dot_issuer_dot_v1_dot_query__pb2.QueryIssuersRequest.SerializeToString,
            em_dot_issuer_dot_v1_dot_query__pb2.QueryIssuersResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
