/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Response;
import com.microsoft.rest.DateTimeRfc1123;
import fixtures.bodydatetimerfc1123.models.Error;

public class Datetimerfc1123Impl implements Datetimerfc1123 {
    private Datetimerfc1123Service service;
    AutoRestRFC1123DateTimeTestService client;

    public Datetimerfc1123Impl(Retrofit retrofit, AutoRestRFC1123DateTimeTestService client) {
        this.service = retrofit.create(Datetimerfc1123Service.class);
        this.client = client;
    }

    /**
     * Get null datetime value
     *
     * @return the DateTimeRfc1123 object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTimeRfc1123 getNull() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getNull();
            ServiceResponse<DateTimeRfc1123> response = getNullDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get null datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNullDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<DateTimeRfc1123>()
                .register(200, new TypeToken<DateTimeRfc1123>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get invalid datetime value
     *
     * @return the DateTimeRfc1123 object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTimeRfc1123 getInvalid() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getInvalid();
            ServiceResponse<DateTimeRfc1123> response = getInvalidDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get invalid datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getInvalidAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getInvalidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<DateTimeRfc1123>()
                .register(200, new TypeToken<DateTimeRfc1123>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get overflow datetime value
     *
     * @return the DateTimeRfc1123 object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTimeRfc1123 getOverflow() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getOverflow();
            ServiceResponse<DateTimeRfc1123> response = getOverflowDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get overflow datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getOverflowAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getOverflow();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getOverflowDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getOverflowDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<DateTimeRfc1123>()
                .register(200, new TypeToken<DateTimeRfc1123>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get underflow datetime value
     *
     * @return the DateTimeRfc1123 object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTimeRfc1123 getUnderflow() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getUnderflow();
            ServiceResponse<DateTimeRfc1123> response = getUnderflowDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get underflow datetime value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getUnderflowAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflow();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUnderflowDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUnderflowDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<DateTimeRfc1123>()
                .register(200, new TypeToken<DateTimeRfc1123>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putUtcMaxDateTime(DateTimeRfc1123 datetimeBody) throws ServiceException {
        if (datetimeBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.putUtcMaxDateTime(datetimeBody);
            ServiceResponse<Void> response = putUtcMaxDateTimeDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putUtcMaxDateTimeAsync(DateTimeRfc1123 datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.putUtcMaxDateTime(datetimeBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putUtcMaxDateTimeDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putUtcMaxDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt
     *
     * @return the DateTimeRfc1123 object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTimeRfc1123 getUtcLowercaseMaxDateTime() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getUtcLowercaseMaxDateTime();
            ServiceResponse<DateTimeRfc1123> response = getUtcLowercaseMaxDateTimeDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getUtcLowercaseMaxDateTime();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUtcLowercaseMaxDateTimeDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcLowercaseMaxDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<DateTimeRfc1123>()
                .register(200, new TypeToken<DateTimeRfc1123>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT
     *
     * @return the DateTimeRfc1123 object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTimeRfc1123 getUtcUppercaseMaxDateTime() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getUtcUppercaseMaxDateTime();
            ServiceResponse<DateTimeRfc1123> response = getUtcUppercaseMaxDateTimeDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getUtcUppercaseMaxDateTime();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUtcUppercaseMaxDateTimeDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcUppercaseMaxDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<DateTimeRfc1123>()
                .register(200, new TypeToken<DateTimeRfc1123>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putUtcMinDateTime(DateTimeRfc1123 datetimeBody) throws ServiceException {
        if (datetimeBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.putUtcMinDateTime(datetimeBody);
            ServiceResponse<Void> response = putUtcMinDateTimeDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putUtcMinDateTimeAsync(DateTimeRfc1123 datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.putUtcMinDateTime(datetimeBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putUtcMinDateTimeDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putUtcMinDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT
     *
     * @return the DateTimeRfc1123 object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public DateTimeRfc1123 getUtcMinDateTime() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getUtcMinDateTime();
            ServiceResponse<DateTimeRfc1123> response = getUtcMinDateTimeDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getUtcMinDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback) {
        Call<ResponseBody> call = service.getUtcMinDateTime();
        call.enqueue(new ServiceResponseCallback<DateTimeRfc1123>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUtcMinDateTimeDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcMinDateTimeDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<DateTimeRfc1123>()
                .register(200, new TypeToken<DateTimeRfc1123>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
