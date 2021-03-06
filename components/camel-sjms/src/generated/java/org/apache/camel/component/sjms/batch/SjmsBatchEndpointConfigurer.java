/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms.batch;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SjmsBatchEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("destinationName", java.lang.String.class);
        map.put("aggregationStrategy", org.apache.camel.AggregationStrategy.class);
        map.put("allowNullBody", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("completionInterval", int.class);
        map.put("completionPredicate", java.lang.String.class);
        map.put("completionSize", int.class);
        map.put("completionTimeout", int.class);
        map.put("consumerCount", int.class);
        map.put("eagerCheckCompletion", boolean.class);
        map.put("includeAllJMSXProperties", boolean.class);
        map.put("mapJmsMessage", boolean.class);
        map.put("pollDuration", int.class);
        map.put("sendEmptyMessageWhenIdle", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("asyncStartListener", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("jmsKeyFormatStrategy", org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
        map.put("keepAliveDelay", int.class);
        map.put("messageCreatedStrategy", org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
        map.put("recoveryInterval", int.class);
        map.put("synchronous", boolean.class);
        map.put("timeoutCheckerExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(SjmsBatchEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SjmsBatchEndpoint target = (SjmsBatchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aggregationstrategy":
        case "aggregationStrategy": target.setAggregationStrategy(property(camelContext, org.apache.camel.AggregationStrategy.class, value)); return true;
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "asyncstartlistener":
        case "asyncStartListener": target.setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "completioninterval":
        case "completionInterval": target.setCompletionInterval(property(camelContext, int.class, value)); return true;
        case "completionpredicate":
        case "completionPredicate": target.setCompletionPredicate(property(camelContext, java.lang.String.class, value)); return true;
        case "completionsize":
        case "completionSize": target.setCompletionSize(property(camelContext, int.class, value)); return true;
        case "completiontimeout":
        case "completionTimeout": target.setCompletionTimeout(property(camelContext, int.class, value)); return true;
        case "consumercount":
        case "consumerCount": target.setConsumerCount(property(camelContext, int.class, value)); return true;
        case "eagercheckcompletion":
        case "eagerCheckCompletion": target.setEagerCheckCompletion(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": target.setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": target.setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "keepalivedelay":
        case "keepAliveDelay": target.setKeepAliveDelay(property(camelContext, int.class, value)); return true;
        case "mapjmsmessage":
        case "mapJmsMessage": target.setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": target.setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "pollduration":
        case "pollDuration": target.setPollDuration(property(camelContext, int.class, value)); return true;
        case "recoveryinterval":
        case "recoveryInterval": target.setRecoveryInterval(property(camelContext, int.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeoutcheckerexecutorservice":
        case "timeoutCheckerExecutorService": target.setTimeoutCheckerExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SjmsBatchEndpoint target = (SjmsBatchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aggregationstrategy":
        case "aggregationStrategy": return target.getAggregationStrategy();
        case "allownullbody":
        case "allowNullBody": return target.isAllowNullBody();
        case "asyncstartlistener":
        case "asyncStartListener": return target.isAsyncStartListener();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "completioninterval":
        case "completionInterval": return target.getCompletionInterval();
        case "completionpredicate":
        case "completionPredicate": return target.getCompletionPredicate();
        case "completionsize":
        case "completionSize": return target.getCompletionSize();
        case "completiontimeout":
        case "completionTimeout": return target.getCompletionTimeout();
        case "consumercount":
        case "consumerCount": return target.getConsumerCount();
        case "eagercheckcompletion":
        case "eagerCheckCompletion": return target.isEagerCheckCompletion();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": return target.isIncludeAllJMSXProperties();
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": return target.getJmsKeyFormatStrategy();
        case "keepalivedelay":
        case "keepAliveDelay": return target.getKeepAliveDelay();
        case "mapjmsmessage":
        case "mapJmsMessage": return target.isMapJmsMessage();
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": return target.getMessageCreatedStrategy();
        case "pollduration":
        case "pollDuration": return target.getPollDuration();
        case "recoveryinterval":
        case "recoveryInterval": return target.getRecoveryInterval();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "synchronous": return target.isSynchronous();
        case "timeoutcheckerexecutorservice":
        case "timeoutCheckerExecutorService": return target.getTimeoutCheckerExecutorService();
        default: return null;
        }
    }
}

